package org.training.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import org.training.dao.ItemWithAllAttributesDao;
import org.training.model.ItemWithAllAttributesModel;

import java.util.List;

public class DefaultItemWithAllAttributesDao extends AbstractItemDao implements ItemWithAllAttributesDao {

    private static final String GET_ALL_ITEMS_QUERY = """
            SELECT {ItemWithAllAttributes.PK} FROM
            {
                ItemWithAllAttributes
            }
            """;
    private static final String GET_ITEMS_BY_NAME_QUERY = """
            SELECT {ItemWithAllAttributes.PK} FROM
            {
                ItemWithAllAttributes
            }
            WHERE
            {name}=?code
            """;

    @Override
    public List<ItemWithAllAttributesModel> findAllItems() {

        final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_ALL_ITEMS_QUERY);

        return flexibleSearchService.<ItemWithAllAttributesModel> search(query).getResult();
    }

    @Override
    public List<ItemWithAllAttributesModel> findItemsByName(String name) {

        final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_ITEMS_BY_NAME_QUERY);
        query.addQueryParameter("code", name);

        return flexibleSearchService.<ItemWithAllAttributesModel> search(query).getResult();
    }

}
