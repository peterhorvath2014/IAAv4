package com.iaa.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by djpet on 2015. 12. 25..
 */
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntitiesGetResponse {
    private EntitiesGetRequest request;
    private Integer entityId;

    public EntitiesGetResponse(EntitiesGetRequest request) {
        this.request = request;
        this.entityId = 10;
    }

    public EntitiesGetRequest getRequest() {
        return request;
    }

    public void setRequest(EntitiesGetRequest request) {
        this.request = request;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }
}
