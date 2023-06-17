package org.training.service.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.junit.Before;
import org.junit.Test;
import org.training.dao.ContactRequestDao;
import org.training.model.ContactRequestModel;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@UnitTest
public class DefaultContactRequestServiceUnitTest {
    private DefaultContactRequestService contactRequestService;
    private ContactRequestDao contactRequestDao;
    private ContactRequestModel contactRequestModel;
    private static final String MESSAGE = "HELLO";
    private static final String SENDER = "Tester";
    private static final String NOT_EXISTING_SENDER = "Tester";


    @Before
    public void setUp()
    {
        contactRequestDao= mock(ContactRequestDao.class);
        contactRequestService = new DefaultContactRequestService();
        contactRequestService.setContactRequestDao(contactRequestDao);
        contactRequestModel = new ContactRequestModel();
        contactRequestModel.setSender(SENDER);
        contactRequestModel.setMessage(MESSAGE);
    }

    @Test
    public void testGetExistingContactRequest()
    {
        when(contactRequestDao.findBySender(SENDER)).thenReturn(Collections.singletonList(contactRequestModel));
        final ContactRequestModel result = contactRequestService.getContactRequest(SENDER);
        assertEquals("ContactRequest should equals() what the mock returned", contactRequestModel, result);
    }

    @Test(expected = UnknownIdentifierException.class)
    public void testGetNotExistingContactRequest() {
        when(contactRequestDao.findBySender(NOT_EXISTING_SENDER)).thenReturn(new ArrayList<>());
        contactRequestService.getContactRequest(NOT_EXISTING_SENDER);
    }

}
