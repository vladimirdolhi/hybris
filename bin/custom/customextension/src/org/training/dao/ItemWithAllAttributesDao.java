package org.training.dao;

import org.training.model.ItemWithAllAttributesModel;

import java.util.List;

public interface ItemWithAllAttributesDao {

    List<ItemWithAllAttributesModel> findAllItems();

    List<ItemWithAllAttributesModel> findItemsByName(String name);

}
