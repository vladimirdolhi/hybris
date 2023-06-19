package org.training.facade.impl;

import org.training.converters.ItemWithAllAttributesConverter;
import org.training.data.ItemWithAllAttributesData;
import org.training.facade.ItemWithAllAttributesFacade;
import org.training.model.ItemWithAllAttributesModel;
import org.training.service.ItemWithAllAttributesService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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

        List<ItemWithAllAttributesData> itemDataList = itemModels.stream()
                .map(model -> itemWithAllAttributesConverter.convert(model)).collect(Collectors.toList());

        return itemDataList;
    }
}
