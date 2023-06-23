package org.training.constraints;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.validation.exceptions.HybrisConstraintViolation;
import de.hybris.platform.validation.services.ValidationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.training.model.MyItem1Model;
import org.training.model.NotLoremIpsumConstraintModel;


import javax.annotation.Resource;
import java.util.Set;

@IntegrationTest
public class NotLoremIpsumConstraintTest extends ServicelayerTransactionalTest {
    @Resource
    private ModelService modelService;
    @Resource
    private ValidationService validationService;
    @Before
    public void setup() throws Exception
    {
        createCoreData();
        importCsv("/impex/essentialdata-constraints.impex", "UTF-8");
        validationService.reloadValidationEngine();
    }
    @Test
    public void testLoremIpsumConstraint()
    {
        final MyItem1Model myItem1Model = modelService.create(MyItem1Model.class);
        myItem1Model.setName("lorem ipsum");
        myItem1Model.setDescription("lorem ipsum");

        final Set<HybrisConstraintViolation> violations = validationService.validate(myItem1Model);

        Assert.assertTrue("The violation set should not be null or empty", violations != null && violations.size() > 0);
        Assert.assertEquals("There should be one constraint violations", 1, violations.size());
        for (final HybrisConstraintViolation hybrisConstraintViolation : violations)
        {
            Assert.assertEquals(NotLoremIpsumConstraintModel.class, hybrisConstraintViolation.getConstraintModel().getClass());
        }
    }
}
