package com.iaa.service;

import com.iaa.rest.model.EntitiesGetRequest;
import com.iaa.service.model.IAAEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by djpet on 2015. 12. 25..
 */
@Service
public class EntityService {
    public List<IAAEntity> getEntities(EntitiesGetRequest request) {
        IAAEntity entity = new IAAEntity();
        entity.setEntityId(13276);
        IAAEntity entity2 = new IAAEntity();
        entity2.setEntityId(13279);
        return Arrays.asList(entity, entity2);
    }
}
