package org.training.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.training.dao.ItemWithAllAttributesDao;
import org.training.model.ItemWithAllAttributesModel;
import org.training.service.ItemWithAllAttributesService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultItemWithAllAttributesService implements ItemWithAllAttributesService {

    @Resource
    private ItemWithAllAttributesDao itemWithAllAttributesDao;

    @Override
    public List<ItemWithAllAttributesModel> getItems() {
        return itemWithAllAttributesDao.findAllItems();
    }

    @Override
    public ItemWithAllAttributesModel getItemForName(String name) {
        final List<ItemWithAllAttributesModel> result = itemWithAllAttributesDao.findItemsByName(name);
        final int resultCount = result.size();
        if (resultCount == 0)
        {
            throw new UnknownIdentifierException(
                    "Item with name '" + name + "' not found!"
            );
        }
        else if (resultCount > 1)
        {
            throw new AmbiguousIdentifierException(
                    "Item with name '" + name + "' is not unique, "
                            + resultCount + " requests found!"
            );
        }
        return result.iterator().next();
    }

    public void setItemWithAllAttributesDao(ItemWithAllAttributesDao itemWithAllAttributesDao) {
        this.itemWithAllAttributesDao = itemWithAllAttributesDao;
    }
}
