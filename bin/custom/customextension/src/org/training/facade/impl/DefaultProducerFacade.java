package org.training.facade.impl;

import org.training.converters.ProducerConverter;
import org.training.data.ProducerData;
import org.training.facade.ProducerFacade;
import org.training.model.ProducerModel;
import org.training.service.ProducerService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultProducerFacade implements ProducerFacade {

    @Resource
    private ProducerService producerService;

    @Resource
    private ProducerConverter producerConverter;

    @Override
    public ProducerData getProducerData(String code) {
        ProducerModel producerModel = producerService.getProducerForCode(code);
        return producerConverter.convert(producerModel);
    }

    @Override
    public List<ProducerData> getAllProducers() {
        List<ProducerModel> producerModels = producerService.getProducers();

        return producerModels.stream()
                .map(model -> producerConverter.convert(model)).toList();
    }
}
