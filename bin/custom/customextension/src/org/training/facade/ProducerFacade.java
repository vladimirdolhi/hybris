package org.training.facade;

import org.training.data.ProducerData;

import java.util.List;

public interface ProducerFacade {

    ProducerData getProducerData(final String code);

    List<ProducerData> getAllProducers();
}
