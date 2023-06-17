package org.training.converters;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.data.ItemWithAllAttributesData;
import org.training.model.ItemWithAllAttributesModel;

public class ItemWithAllAttributesConverter  implements Converter<ItemWithAllAttributesModel, ItemWithAllAttributesData> {
    @Override
    public ItemWithAllAttributesData convert(ItemWithAllAttributesModel itemWithAllAttributesModel) throws ConversionException {
        return convert(itemWithAllAttributesModel, new ItemWithAllAttributesData());
    }

    @Override
    public ItemWithAllAttributesData convert(ItemWithAllAttributesModel itemModel, ItemWithAllAttributesData itemData) throws ConversionException {
        itemData.setName(itemModel.getName());
        itemData.setEnumProperty(itemModel.getCustomEnumProperty());
        itemData.setMapProperty(itemModel.getCustomMapAttribute());
        itemData.setListProperty(itemModel.getCustomListAttribute());
        return itemData;
    }
}
