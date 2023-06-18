package org.training.service.impl;

import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.training.enums.MyStaticEnum;
import org.training.model.ItemWithAllAttributesModel;
import org.training.service.ItemWithAllAttributesService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Map.entry;

public class DefaultItemWithAllAttributesServiceIntegrationTest extends ServicelayerTransactionalTest {
    @Resource
    private ModelService modelService;
    @Resource
    private ItemWithAllAttributesService itemWithAllAttributesService;

    private ItemWithAllAttributesModel itemModel1;
    private ItemWithAllAttributesModel itemModel2;


    private static final String TEST_NAME_1 = "TEST_NAME_1";
    private static final MyStaticEnum TEST_ENUM_VALUE_1 = MyStaticEnum.VALUE1;
    private static final Map<String, String> TEST_MAP_1 = Map.ofEntries(
            entry("a", "b"),
            entry("c", "d")
    );
    private static final List<Integer> TEST_LIST_1 = List.of(1, 2, 3, 4, 5);

    private static final String TEST_NAME_2 = "TEST_NAME_2";
    private static final MyStaticEnum TEST_ENUM_VALUE_2 = MyStaticEnum.VALUE1;
    private static final Map<String, String> TEST_MAP_2 = Map.ofEntries(
            entry("a1", "b1"),
            entry("c1", "d1")
    );
    private static final List<Integer> TEST_LIST_2 = List.of(11, 21, 31, 41, 51);

    @Before
    public void setUp() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            new JdbcTemplate(Registry.getCurrentTenant().getDataSource()).execute("CHECKPOINT");
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException exc) {}

        itemModel1 = new ItemWithAllAttributesModel();
        itemModel2 = new ItemWithAllAttributesModel();

        itemModel1.setName(TEST_NAME_1);
        itemModel1.setCustomEnumProperty(TEST_ENUM_VALUE_1);
        itemModel1.setCustomMapAttribute(TEST_MAP_1);
        itemModel1.setCustomListAttribute(TEST_LIST_1);

        itemModel2.setName(TEST_NAME_2);
        itemModel2.setCustomEnumProperty(TEST_ENUM_VALUE_2);
        itemModel2.setCustomMapAttribute(TEST_MAP_2);
        itemModel2.setCustomListAttribute(TEST_LIST_2);
    }

    @Test(expected = UnknownIdentifierException.class)
    public void testNotExistingItemFailBehavior()
    {
        itemWithAllAttributesService.getItemForName(TEST_NAME_1);
    }
    @Test
    public void getItemByNameTest(){
        modelService.save(itemModel1);
        ItemWithAllAttributesModel itemByName = itemWithAllAttributesService.getItemForName(TEST_NAME_1);
        Assert.assertNotNull("Did not find the item we just saved", itemByName);

        Assert.assertEquals("Retrieved item's name value attribute incorrect", TEST_NAME_1,
                itemByName.getName());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_1,
                itemByName.getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_1,
                itemByName.getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_1,
                itemByName.getCustomListAttribute());
    }

    @Test
    public void getAllItemsTest(){
        modelService.save(itemModel1);
        modelService.save(itemModel2);
        List<ItemWithAllAttributesModel> items = itemWithAllAttributesService.getItems();

        Assert.assertFalse("Did not find the items we just saved", items.isEmpty());

        Assert.assertEquals("Retrieved item's name value attribute incorrect", TEST_NAME_1,
                items.get(0).getName());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_1,
                items.get(0).getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_1,
                items.get(0).getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_1,
                items.get(0).getCustomListAttribute());

        Assert.assertEquals("Retrieved item's name value attribute incorrect", TEST_NAME_2,
                items.get(1).getName());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_2,
                items.get(1).getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_2,
                items.get(1).getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_2,
                items.get(1).getCustomListAttribute());
    }
}
