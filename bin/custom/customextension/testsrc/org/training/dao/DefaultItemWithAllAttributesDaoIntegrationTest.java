package org.training.dao;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.training.enums.MyStaticEnum;
import org.training.model.ItemWithAllAttributesModel;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Map.entry;
import static org.junit.Assert.assertTrue;

@IntegrationTest
public class DefaultItemWithAllAttributesDaoIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    private ItemWithAllAttributesDao itemWithAllAttributesDao;
    @Resource
    private ModelService modelService;

    private static final String TEST_NAME_1 = "TEST_NAME";
    private static final MyStaticEnum TEST_ENUM_VALUE_1 = MyStaticEnum.VALUE1;
    private static final Map<String, String> TEST_MAP_1 = Map.ofEntries(
            entry("a", "b"),
            entry("c", "d")
    );
    private static final List<Integer> TEST_LIST_1 = List.of(1, 2, 3, 4, 5);

    private static final String TEST_NAME_2 = "TEST_NAME_2";
    private static final MyStaticEnum TEST_ENUM_VALUE_2 = MyStaticEnum.VALUE2;
    private static final Map<String, String> TEST_MAP_2 = Map.ofEntries(
            entry("1", "2"),
            entry("3", "4")
    );
    private static final List<Integer> TEST_LIST_2 = List.of(10, 20, 30, 40, 50);

    @Before
    public void setUp() throws Exception {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            new JdbcTemplate(Registry.getCurrentTenant().getDataSource()).execute("CHECKPOINT");
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException exc) {}
    }

    @Test
    public void getAllItemsTest()
    {
        List<ItemWithAllAttributesModel> itemsByName = itemWithAllAttributesDao.findAllItems();
        assertTrue("No item should be returned", itemsByName.isEmpty());

        final ItemWithAllAttributesModel itemModel1 = modelService.create(ItemWithAllAttributesModel.class);
        itemModel1.setName(TEST_NAME_1);
        itemModel1.setCustomEnumProperty(TEST_ENUM_VALUE_1);
        itemModel1.setCustomMapAttribute(TEST_MAP_1);
        itemModel1.setCustomListAttribute(TEST_LIST_1);
        modelService.save(itemModel1);

        final ItemWithAllAttributesModel itemModel2 = modelService.create(ItemWithAllAttributesModel.class);
        itemModel2.setName(TEST_NAME_2);
        itemModel2.setCustomEnumProperty(TEST_ENUM_VALUE_2);
        itemModel2.setCustomMapAttribute(TEST_MAP_2);
        itemModel2.setCustomListAttribute(TEST_LIST_2);
        modelService.save(itemModel2);

        itemsByName = itemWithAllAttributesDao.findAllItems();
        Assert.assertEquals("Did not find all items we just saved", 2, itemsByName.size());

        Assert.assertEquals("Retrieved item's name value attribute incorrect", TEST_NAME_1,
                itemsByName.get(0).getName());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_1,
                itemsByName.get(0).getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_1,
                itemsByName.get(0).getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_1,
                itemsByName.get(0).getCustomListAttribute());

        Assert.assertEquals("Retrieved item's name value attribute incorrect", TEST_NAME_2,
                itemsByName.get(1).getName());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_2,
                itemsByName.get(1).getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_2,
                itemsByName.get(1).getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_2,
                itemsByName.get(1).getCustomListAttribute());
    }

    @Test
    public void getItemByNameTest()
    {
        List<ItemWithAllAttributesModel> itemsByName = itemWithAllAttributesDao.findItemsByName(TEST_NAME_1);
        assertTrue("No item should be returned", itemsByName.isEmpty());
        final ItemWithAllAttributesModel itemModel = modelService.create(ItemWithAllAttributesModel.class);
        itemModel.setName(TEST_NAME_1);
        itemModel.setCustomEnumProperty(TEST_ENUM_VALUE_1);
        itemModel.setCustomMapAttribute(TEST_MAP_1);
        itemModel.setCustomListAttribute(TEST_LIST_1);
        modelService.save(itemModel);

        itemsByName = itemWithAllAttributesDao.findItemsByName(TEST_NAME_1);
        Assert.assertEquals("Did not find the item we just saved", 1, itemsByName.size());
        Assert.assertEquals("Retrieved item's enum value attribute incorrect", TEST_ENUM_VALUE_1,
                itemsByName.get(0).getCustomEnumProperty());
        Assert.assertEquals("Retrieved item's map attribute incorrect", TEST_MAP_1,
                itemsByName.get(0).getCustomMapAttribute());
        Assert.assertEquals("Retrieved item's list attribute incorrect", TEST_LIST_1,
                itemsByName.get(0).getCustomListAttribute());
    }
}
