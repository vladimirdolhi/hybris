package org.training.facade;

import org.training.data.ContactRequestData;

public interface ContactRequestFacade {
    ContactRequestData getContactRequestData(final String sender);

    String getDefaultSender();

}
