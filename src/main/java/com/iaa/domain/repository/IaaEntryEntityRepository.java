package com.iaa.domain.repository;

import com.iaa.domain.model.IaaEntryEntity;
import org.springframework.data.repository.Repository;

import java.util.List;


/**
 * Created by djpet on 2015. 12. 25..
 */
public interface IaaEntryEntityRepository extends Repository<IaaEntryEntity, Long> {
    List<IaaEntryEntity> findAll();
}

