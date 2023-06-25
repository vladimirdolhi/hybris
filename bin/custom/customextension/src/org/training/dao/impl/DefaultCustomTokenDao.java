package org.training.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import org.training.dao.CustomTokenDao;
import org.training.model.CustomTokenModel;

public class DefaultCustomTokenDao extends AbstractItemDao implements CustomTokenDao {

    private static final String GET_TOKEN_QUERY = """
            SELECT {CustomToken.PK} FROM
            {
                CustomToken
            }
            ORDER BY {CustomToken.PK} DESC
            LIMIT 1
            """;
    @Override
    public CustomTokenModel getLastCreated() {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_TOKEN_QUERY);
        return flexibleSearchService.searchUnique(query);
    }
}
