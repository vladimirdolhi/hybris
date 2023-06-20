package org.training.service.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.junit.Before;
import org.junit.Test;
import org.training.dao.ItemWithAllAttributesDao;
import org.training.enums.MyStaticEnum;
import org.training.model.ItemWithAllAttributesModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@UnitTest
public class DefaultItemWithAllAttributesServiceUnitTest {

    private DefaultItemWithAllAttributesService itemService;
    private ItemWithAllAttributesDao itemWithAllAttributesDao;
    private ItemWithAllAttributesModel itemModel1;
    private ItemWithAllAttributesModel itemModel2;

    private static final String TEST_NAME_1 = "TEST1";
    private static final MyStaticEnum TEST_ENUM_VALUE_1 = MyStaticEnum.VALUE1;
    private static final Map<String, String> TEST_MAP_1 = Map.ofEntries(
            entry("q", "w"),
            entry("e", "r")
    );
    private static final List<Integer> TEST_LIST_1 = List.of(1, 21, 3, 4, 5);

    private static final String TEST_NAME_2 = "TEST2";
    private static final MyStaticEnum TEST_ENUM_VALUE_2 = MyStaticEnum.VALUE1;
    private static final Map<String, String> TEST_MAP_2 = Map.ofEntries(
            entry("t", "y"),
            entry("u", "i")
    );
    private static final List<Integer> TEST_LIST_2 = List.of(11, 211, 311, 411, 51);

    private static final String NOT_EXISTING_NAME = "TEST1";



    @Before
    public void setUp()
    {
        itemWithAllAttributesDao = mock(ItemWithAllAttributesDao.class);
        itemService = new DefaultItemWithAllAttributesService();
        itemService.setItemWithAllAttributesDao(itemWithAllAttributesDao);

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

    @Test
    public void testGetExistingItem()
    {
        when(itemWithAllAttributesDao.findAllItems()).thenReturn(List.of(itemModel1, itemModel2));
        final List<ItemWithAllAttributesModel> result = itemService.getItems();
        assertEquals("ContactRequest should equals() what the mock returned", List.of(itemModel1, itemModel2), result);
    }

    @Test
    public void testGetAllItems()
    {
        when(itemWithAllAttributesDao.findItemsByName(TEST_NAME_1)).thenReturn(Collections.singletonList(itemModel1));
        final ItemWithAllAttributesModel result = itemService.getItemForName(TEST_NAME_1);
        assertEquals("ContactRequest should equals() what the mock returned", itemModel1, result);
    }

    @Test(expected = UnknownIdentifierException.class)
    public void testGetNotExistingCItem() {
        when(itemWithAllAttributesDao.findItemsByName(NOT_EXISTING_NAME)).thenReturn(new ArrayList<>());
        itemService.getItemForName(NOT_EXISTING_NAME);
    }
}
