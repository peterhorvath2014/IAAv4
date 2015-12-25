package com.iaa.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iaa.domain.model.Entry;

import java.util.List;

/**
 * Created by djpet on 2015. 12. 25..
 */
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntitiesGetResponse {
    private EntitiesGetRequest request;
    private List<Entry> entities;

    public EntitiesGetResponse(EntitiesGetRequest request, List<Entry> entities) {
        this.request = request;
        this.entities = entities;
    }

    public EntitiesGetRequest getRequest() {
        return request;
    }

    public void setRequest(EntitiesGetRequest request) {
        this.request = request;
    }

    public List<Entry> getEntities() {
        return entities;
    }

    public void setEntities(List<Entry> entities) {
        this.entities = entities;
    }
}
