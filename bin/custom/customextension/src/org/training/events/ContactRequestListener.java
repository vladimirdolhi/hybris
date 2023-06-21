package org.training.events;

import de.hybris.platform.servicelayer.event.events.AfterItemCreationEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.model.ContactRequestModel;
import org.training.model.NewsModel;

import javax.annotation.Resource;
import java.util.Date;

public class ContactRequestListener extends AbstractEventListener<AfterItemCreationEvent> {

    private static final String NEW_REQUEST_SENDER = "New message from %s";
    private static final String NEW_REQUEST_CONTENT = "Message: %s";

    @Resource
    private ModelService modelService;

    @Override
    protected void onEvent(AfterItemCreationEvent event) {
        if (event != null && event.getSource() != null)
        {
            final Object object = modelService.get(event.getSource());
            if (object instanceof ContactRequestModel)
            {
                final ContactRequestModel contactRequestModel = (ContactRequestModel) object;
                final String headline = String.format(NEW_REQUEST_SENDER, contactRequestModel.getSender());
                final String content = String.format(NEW_REQUEST_CONTENT, contactRequestModel.getMessage());
                final NewsModel news = modelService.create(NewsModel.class);
                news.setDate(new Date());
                news.setHeadline(headline);
                news.setContent(content);
                modelService.save(news);
            }
        }
    }

}
