package org.training.service;

import org.training.model.ItemWithAllAttributesModel;

import java.util.List;

public interface ItemWithAllAttributesService {

    List<ItemWithAllAttributesModel> getItems();

    ItemWithAllAttributesModel getItemForName(String name);

}
