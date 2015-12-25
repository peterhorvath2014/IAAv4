package com.iaa.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Created by djpet on 2015. 12. 25..
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntitiesGetRequest {
    private Integer entityLimit;
    private Integer entityOffset;
    private SortType sortType;
    private SortOrder sortOrder;
    private EntitiesFilter filter;

    public Integer getEntityLimit() {
        return entityLimit;
    }

    public void setEntityLimit(Integer entityLimit) {
        this.entityLimit = entityLimit;
    }

    public Integer getEntityOffset() {
        return entityOffset;
    }

    public void setEntityOffset(Integer entityOffset) {
        this.entityOffset = entityOffset;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    public EntitiesFilter getFilter() {
        return filter;
    }

    public void setFilter(EntitiesFilter filter) {
        this.filter = filter;
    }
}
