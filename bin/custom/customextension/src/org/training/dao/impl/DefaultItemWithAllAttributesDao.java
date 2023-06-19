package org.training.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import org.training.dao.ItemWithAllAttributesDao;
import org.training.model.ItemWithAllAttributesModel;

import java.util.List;

public class DefaultItemWithAllAttributesDao extends AbstractItemDao implements ItemWithAllAttributesDao {

    @Override
    public List<ItemWithAllAttributesModel> findAllItems() {
        final String queryString = """
            SELECT {ItemWithAllAttributes.PK} FROM
            {
                ItemWithAllAttributes
            }
            """;
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        return flexibleSearchService.<ItemWithAllAttributesModel> search(query).getResult();
    }

    @Override
    public List<ItemWithAllAttributesModel> findItemsByName(String name) {
        final String queryString = """
            SELECT {ItemWithAllAttributes.PK} FROM
            {
                ItemWithAllAttributes
            }
            WHERE
            {name}=?code
            """;
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("code", name);
        return flexibleSearchService.<ItemWithAllAttributesModel> search(query).getResult();
    }

}
