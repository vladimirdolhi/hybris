package org.training.converters;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.data.ConcertTourData;
import org.training.data.ProducerData;
import org.training.model.ProducerModel;

import javax.annotation.Resource;
import java.util.List;

public class ProducerConverter implements Converter<ProducerModel, ProducerData>  {

    @Resource
    private ConcertTourConverter concertTourConverter;

    @Override
    public ProducerData convert(ProducerModel producerModel) throws ConversionException {
        return convert(producerModel, new ProducerData());
    }

    @Override
    public ProducerData convert(ProducerModel producerModel, ProducerData producerData) throws ConversionException {
        producerData.setCode(producerModel.getCode());
        producerData.setFirstname(producerModel.getFirstname());
        producerData.setLastname(producerModel.getLastname());
        List<ConcertTourData> concertTourDataList = producerModel.getTours().stream()
                .map(concertTourModel -> concertTourConverter.convert(concertTourModel)).toList();
        producerData.setConcertTours(concertTourDataList);
        return producerData;
    }
}
