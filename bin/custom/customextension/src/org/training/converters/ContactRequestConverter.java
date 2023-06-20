package org.training.converters;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.data.ContactRequestData;
import org.training.model.ContactRequestModel;

public class ContactRequestConverter implements Converter<ContactRequestModel, ContactRequestData> {
    @Override
    public ContactRequestData convert(ContactRequestModel contactRequestModel) throws ConversionException {
        return convert(contactRequestModel, new ContactRequestData());
    }

    @Override
    public ContactRequestData convert(ContactRequestModel contactRequestModel, ContactRequestData contactRequestData) throws ConversionException {
        contactRequestData.setSender(contactRequestModel.getSender());
        contactRequestData.setMessage(contactRequestModel.getMessage());
        return contactRequestData;
    }
}