package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_place_name_index_iaa_entry", schema = "iaa", catalog = "")
public class IaaPlaceNameIndexIaaEntryEntity implements Serializable {
    private int entryId;
    private int placeNameIndexId;

    @Id
    @Basic
    @Column(name = "entry_id")
    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    @Id
    @Basic
    @Column(name = "place_name_index_id")
    public int getPlaceNameIndexId() {
        return placeNameIndexId;
    }

    public void setPlaceNameIndexId(int placeNameIndexId) {
        this.placeNameIndexId = placeNameIndexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPlaceNameIndexIaaEntryEntity that = (IaaPlaceNameIndexIaaEntryEntity) o;

        if (entryId != that.entryId) return false;
        if (placeNameIndexId != that.placeNameIndexId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryId;
        result = 31 * result + placeNameIndexId;
        return result;
    }
}
