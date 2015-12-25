package com.iaa.domain.repository;

import com.iaa.domain.model.Entry;
import org.springframework.data.repository.Repository;

import java.util.List;


/**
 * Created by djpet on 2015. 12. 25..
 */
public interface IaaRepository extends Repository<Entry, Long> {
    List<Entry> findAll();
}

