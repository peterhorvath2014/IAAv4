package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_place_of_dating", schema = "iaa", catalog = "")
public class IaaEntryPlaceOfDatingEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private int placeId;
    private String placeGiven;
    private int addId;
    private int dPlaceSelectorId;
    private String note;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entry_common_id")
    public int getEntryCommonId() {
        return entryCommonId;
    }

    public void setEntryCommonId(int entryCommonId) {
        this.entryCommonId = entryCommonId;
    }

    @Basic
    @Column(name = "d_provided_id")
    public int getdProvidedId() {
        return dProvidedId;
    }

    public void setdProvidedId(int dProvidedId) {
        this.dProvidedId = dProvidedId;
    }

    @Basic
    @Column(name = "place_id")
    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    @Basic
    @Column(name = "place_given")
    public String getPlaceGiven() {
        return placeGiven;
    }

    public void setPlaceGiven(String placeGiven) {
        this.placeGiven = placeGiven;
    }

    @Basic
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Basic
    @Column(name = "d_place_selector_id")
    public int getdPlaceSelectorId() {
        return dPlaceSelectorId;
    }

    public void setdPlaceSelectorId(int dPlaceSelectorId) {
        this.dPlaceSelectorId = dPlaceSelectorId;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryPlaceOfDatingEntity that = (IaaEntryPlaceOfDatingEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (placeId != that.placeId) return false;
        if (addId != that.addId) return false;
        if (dPlaceSelectorId != that.dPlaceSelectorId) return false;
        if (placeGiven != null ? !placeGiven.equals(that.placeGiven) : that.placeGiven != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + placeId;
        result = 31 * result + (placeGiven != null ? placeGiven.hashCode() : 0);
        result = 31 * result + addId;
        result = 31 * result + dPlaceSelectorId;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
