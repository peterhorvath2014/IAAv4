package com.iaa.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by djpet on 2015. 12. 25..
 */
@Entity(name = "iaa_entry")
public class Entry {
    @Id
    @GeneratedValue
    private Long id;

    public Entry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
