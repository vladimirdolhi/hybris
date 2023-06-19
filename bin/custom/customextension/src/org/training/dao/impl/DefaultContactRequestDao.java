package org.training.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.dao.ContactRequestDao;
import org.training.model.ContactRequestModel;

import java.util.List;

public class DefaultContactRequestDao extends AbstractItemDao implements ContactRequestDao {
    @Override
    public List<ContactRequestModel> findBySender(String sender) {
        final String queryString = """
            SELECT {ContactRequest.PK} FROM
            {
                ContactRequest
            }
            WHERE {ContactRequest.SENDER} = ?sender
            """;
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("sender", sender);
        final SearchResult<ContactRequestModel> result = flexibleSearchService.search(query);
        return result.getResult();
    }
}