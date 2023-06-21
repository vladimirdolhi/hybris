package org.training.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import org.training.model.CustomTokenModel;

public interface CustomTokenDao extends Dao {

    CustomTokenModel getLastCreated();

}
