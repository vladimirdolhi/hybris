package org.training.facade.impl;

import org.training.converters.ItemWithAllAttributesConverter;
import org.training.data.ItemWithAllAttributesData;
import org.training.facade.ItemWithAllAttributesFacade;
import org.training.model.ItemWithAllAttributesModel;
import org.training.service.ItemWithAllAttributesService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DefaultItemWithAllAttributesFacade implements ItemWithAllAttributesFacade {

    @Resource
    private ItemWithAllAttributesService itemWithAllAttributesService;
    @Resource
    private ItemWithAllAttributesConverter itemWithAllAttributesConverter;
    @Override
    public ItemWithAllAttributesData getItemData(String name) {
        ItemWithAllAttributesModel itemModel = itemWithAllAttributesService.getItemForName(name);
        return itemWithAllAttributesConverter.convert(itemModel);
    }

    @Override
    public List<ItemWithAllAttributesData> getAllItems() {
        List<ItemWithAllAttributesModel> itemModels = itemWithAllAttributesService.getItems();
        List<ItemWithAllAttributesData> itemDataList = new ArrayList<>();
        for(ItemWithAllAttributesModel model : itemModels){
            itemDataList.add(itemWithAllAttributesConverter.convert(model));
        }
        return itemDataList;
    }
}
