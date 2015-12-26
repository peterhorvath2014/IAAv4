package com.iaa.rest.model.response;

import com.iaa.domain.model.IaaEntryEntity;
import com.iaa.domain.repository.IaaEntryBibliographicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Peter Horvath on 2015. 12. 26..
 */
public class Location {
    private int id;
    private String name;
    private int numberOfAlbums;

    public Location(int id, String name, int numberOfAlbums) {
        this.id = id;
        this.name = name;
        this.numberOfAlbums = numberOfAlbums;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }
}
