package org.training.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import org.training.dao.ProducerDao;
import org.training.model.ProducerModel;

import java.util.List;

public class DefaultProducerDao extends AbstractItemDao implements ProducerDao {

    private static final String GET_ALL_PRODUCERS_QUERY = """
            SELECT {Producer.PK} FROM
            {
                Producer
            }
            """;
    private static final String GET_PRODUCERS_BY_NAME_QUERY = """
            SELECT {Producer.PK} FROM
            {
                Producer
            }
            WHERE
            {code}=?code
            """;

    @Override
    public List<ProducerModel> findAllProducers() {

        final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_ALL_PRODUCERS_QUERY);

        return flexibleSearchService.<ProducerModel> search(query).getResult();
    }

    @Override
    public List<ProducerModel> findProducersByCode(String code) {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_PRODUCERS_BY_NAME_QUERY);
        query.addQueryParameter("code", code);

        return flexibleSearchService.<ProducerModel> search(query).getResult();
    }
}
