package org.training.converters;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.data.ConcertTourData;
import org.training.model.ConcertTourModel;


public class ConcertTourConverter implements Converter<ConcertTourModel, ConcertTourData> {

    @Override
    public ConcertTourData convert(ConcertTourModel concertTourModel) throws ConversionException {
        return convert(concertTourModel, new ConcertTourData());
    }

    @Override
    public ConcertTourData convert(ConcertTourModel concertTourModel, ConcertTourData concertTourData) throws ConversionException {
        concertTourData.setCode(concertTourModel.getCode());
        concertTourData.setName(concertTourModel.getName());
        concertTourData.setDescription(concertTourModel.getDescription());
        return concertTourData;
    }
}
