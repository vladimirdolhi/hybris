package org.training.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class ContactRequestEvent extends AbstractEvent {

    private final String sender;
    private final String message;

    public ContactRequestEvent(String sender, String message) {
        super();
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

}
