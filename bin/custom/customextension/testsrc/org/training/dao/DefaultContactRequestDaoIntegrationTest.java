package org.training.dao;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.training.model.ContactRequestModel;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@IntegrationTest
public class DefaultContactRequestDaoIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private ContactRequestDao contactRequestDao;
    @Resource
    private ModelService modelService;
    private static final String MESSAGE = "HELLO";
    private static final String SENDER = "Tester";

    @Before
    public void setUp() throws Exception {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            new JdbcTemplate(Registry.getCurrentTenant().getDataSource()).execute("CHECKPOINT");
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException exc) {}
    }

    @Test
    public void setContactRequestDaoTest()
    {
        List<ContactRequestModel> requestsBySender = contactRequestDao.findBySender(SENDER);
        assertTrue("No message should be returned", requestsBySender.isEmpty());
        final ContactRequestModel contactRequestModel = modelService.create(ContactRequestModel.class);
        contactRequestModel.setMessage(MESSAGE);
        contactRequestModel.setSender(SENDER);
        modelService.save(contactRequestModel);

        requestsBySender = contactRequestDao.findBySender(SENDER);
        Assert.assertEquals("Did not find the request we just saved", 1, requestsBySender.size());
        Assert.assertEquals("Retrieved request's code attribute incorrect", MESSAGE, requestsBySender.get(0).getMessage());
    }
}
