package com.iaa.domain.repository;

import com.iaa.domain.model.IaaEntryBibliographicDataEntity;
import org.springframework.data.repository.Repository;


/**
 * Created by djpet on 2015. 12. 25..
 */
public interface IaaEntryBibliographicDataRepository extends Repository<IaaEntryBibliographicDataEntity, Long> {
    IaaEntryBibliographicDataEntity findByEntryCommonId(int entryCommonId);
}

