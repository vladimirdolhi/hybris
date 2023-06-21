package org.training.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.dao.CustomTokenDao;
import org.training.model.CustomTokenModel;

import javax.annotation.Resource;
import java.util.UUID;

public class UpdateCustomTokenValueJob extends AbstractJobPerformable<CronJobModel> {

    @Resource
    private CustomTokenDao customTokenDao;
    @Resource
    private ModelService modelService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        CustomTokenModel tokenModel = customTokenDao.getLastCreated();
        tokenModel.setValue(String.valueOf(UUID.randomUUID()));
        modelService.save(tokenModel);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
