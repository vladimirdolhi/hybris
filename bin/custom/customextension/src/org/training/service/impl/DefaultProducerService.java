package org.training.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.training.dao.ProducerDao;
import org.training.model.ProducerModel;
import org.training.service.ProducerService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultProducerService implements ProducerService {

    @Resource
    private ProducerDao producerDao;

    @Override
    public List<ProducerModel> getProducers() {
        return producerDao.findAllProducers();
    }

    @Override
    public ProducerModel getProducerForCode(String code) {
        final List<ProducerModel> result = producerDao.findProducersByCode(code);
        final int resultCount = result.size();
        if (resultCount == 0)
        {
            throw new UnknownIdentifierException(
                    "Producer with code '" + code + "' not found!"
            );
        }
        else if (resultCount > 1)
        {
            throw new AmbiguousIdentifierException(
                    "Producer with code '" + code + "' is not unique, "
                            + resultCount + " requests found!"
            );
        }
        return result.iterator().next();
    }
}
