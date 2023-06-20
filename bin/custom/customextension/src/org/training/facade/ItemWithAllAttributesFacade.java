package org.training.facade;

import org.training.data.ItemWithAllAttributesData;

import java.util.List;

public interface ItemWithAllAttributesFacade {

    ItemWithAllAttributesData getItemData(final String name);

    List<ItemWithAllAttributesData> getAllItems();

}
