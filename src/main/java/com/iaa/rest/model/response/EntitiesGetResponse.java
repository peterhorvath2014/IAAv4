package com.iaa.rest.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iaa.rest.model.request.EntitiesGetRequest;

import java.util.List;

/**
 * Created by djpet on 2015. 12. 25..
 */
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntitiesGetResponse {
    private EntitiesGetRequest request;
    private List<Location> locations;
    private List<Album> albums;
    private List<Entry> entities;

    public EntitiesGetResponse(EntitiesGetRequest request, List<Location> locations) {
        this.request = request;
        this.locations = locations;
    }

    public EntitiesGetRequest getRequest() {
        return request;
    }

    public void setRequest(EntitiesGetRequest request) {
        this.request = request;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Entry> getEntities() {
        return entities;
    }

    public void setEntities(List<Entry> entities) {
        this.entities = entities;
    }
}
