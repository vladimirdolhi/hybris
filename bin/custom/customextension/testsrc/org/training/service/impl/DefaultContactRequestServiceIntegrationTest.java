package org.training.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.training.model.ContactRequestModel;
import org.training.service.ContactRequestService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


@IntegrationTest
public class DefaultContactRequestServiceIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private ModelService modelService;
    @Resource
    private ContactRequestService contactRequestService;

    private ContactRequestModel contactRequestModel;

    private static final String MESSAGE = "HELLO";
    private static final String SENDER = "Tester";

    @Before
    public void setUp() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            new JdbcTemplate(Registry.getCurrentTenant().getDataSource()).execute("CHECKPOINT");
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException exc) {}
        contactRequestModel = new ContactRequestModel();
        contactRequestModel.setSender(SENDER);
        contactRequestModel.setMessage(MESSAGE);
    }

    @Test(expected = UnknownIdentifierException.class)
    public void testFailBehavior()
    {
        contactRequestService.getContactRequest(SENDER);
    }
    @Test
    public void contactRequestServiceTest(){
        modelService.save(contactRequestModel);
        ContactRequestModel requestsBySender = contactRequestService.getContactRequest(SENDER);
        Assert.assertNotNull("Did not find the request we just saved", requestsBySender);
        Assert.assertEquals("Retrieved request's code attribute incorrect", MESSAGE, requestsBySender.getMessage());
    }

}
