package org.training.interceptors;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.events.ContactRequestEvent;
import org.training.model.ContactRequestModel;

import static de.hybris.platform.servicelayer.model.ModelContextUtils.getItemModelContext;

public class ContactRequestInterceptor implements ValidateInterceptor, PrepareInterceptor {

    private static final int MIN_MESSAGE_LENGTH = 3;
    private static final int MAX_MESSAGE_LENGTH = 255;
    private static final int BIG_MESSAGE_LENGTH = 50;

    @Autowired
    private EventService eventService;

    @Override
    public void onPrepare(Object model, InterceptorContext interceptorContext) throws InterceptorException {
        if (model instanceof ContactRequestModel)
        {
            final ContactRequestModel contactRequestModel = (ContactRequestModel) model;
            if (hasMsgBecomeBig(contactRequestModel, interceptorContext))
            {
                eventService.publishEvent(new ContactRequestEvent(contactRequestModel.getSender(),
                        contactRequestModel.getMessage()));
            }
        }
    }

    @Override
    public void onValidate(Object model, InterceptorContext interceptorContext) throws InterceptorException {
        if (model instanceof ContactRequestModel)
        {
            final ContactRequestModel contactRequestModel = (ContactRequestModel) model;
            final int msgLength = contactRequestModel.getMessage().length();
            if (msgLength < MIN_MESSAGE_LENGTH || msgLength > MAX_MESSAGE_LENGTH)
            {
                throw new InterceptorException("Message must be between " + MIN_MESSAGE_LENGTH + " and "
                        + MAX_MESSAGE_LENGTH + " characters");
            }
        }
    }
    private boolean hasMsgBecomeBig(final ContactRequestModel contactRequestModel, final InterceptorContext ctx)
    {
        final int msgLenth = contactRequestModel.getMessage().length();
        if (msgLenth >= BIG_MESSAGE_LENGTH)
        {
            if (ctx.isNew(contactRequestModel))
            {
                return true;
            }
            else
            {
                final String oldMsg = getItemModelContext(contactRequestModel)
                        .getOriginalValue(ContactRequestModel.MESSAGE);
                if (oldMsg.length() < BIG_MESSAGE_LENGTH)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
