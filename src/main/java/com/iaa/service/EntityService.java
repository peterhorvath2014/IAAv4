package com.iaa.service;

import com.iaa.domain.model.Entry;
import com.iaa.domain.repository.IaaRepository;
import com.iaa.rest.model.EntitiesGetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by djpet on 2015. 12. 25..
 */
@Service
public class EntityService {
    @Autowired
    private IaaRepository iaaRepository;

    public List<Entry> getEntities(EntitiesGetRequest request) {
        return iaaRepository.findAll();
    }
}
