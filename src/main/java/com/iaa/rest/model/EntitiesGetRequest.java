package com.iaa.rest.model;

/**
 * Created by djpet on 2015. 12. 25..
 */
public class EntitiesGetRequest {
    private int entityLimit;
    private int entityOffset;
    private SortType sortType;
    private SortOrder sortOrder;
    private EntitiesFilter filter;
}
