package org.training.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.NewsModel;

import java.util.Date;

public class ContactRequestEventListener extends AbstractEventListener<ContactRequestEvent> {

    private static final String CONTACT_REQUEST_NEWS_HEADLINE = "%s send big message";
    private static final String CONTACT_REQUEST_NEWS_CONTENT = "%s messege length reported as %d";

    @Autowired
    private ModelService modelService;

    @Override
    protected void onEvent(ContactRequestEvent event) {
        if (event != null)
        {
            final String headline = String.format(CONTACT_REQUEST_NEWS_HEADLINE, event.getSender());
            final String content = String.format(CONTACT_REQUEST_NEWS_CONTENT, event.getSender(), event.getMessage().length());
            final NewsModel news = modelService.create(NewsModel.class);
            news.setDate(new Date());
            news.setHeadline(headline);
            news.setContent(content);
            modelService.save(news);
        }
    }
}
