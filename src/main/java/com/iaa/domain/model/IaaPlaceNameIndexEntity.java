package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_place_name_index", schema = "iaa", catalog = "")
public class IaaPlaceNameIndexEntity implements Serializable {
    private int id;
    private String name;
    private int dBasicTypeId;
    private String nameIndexing;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "d_basic_type_id")
    public int getdBasicTypeId() {
        return dBasicTypeId;
    }

    public void setdBasicTypeId(int dBasicTypeId) {
        this.dBasicTypeId = dBasicTypeId;
    }

    @Basic
    @Column(name = "name_indexing")
    public String getNameIndexing() {
        return nameIndexing;
    }

    public void setNameIndexing(String nameIndexing) {
        this.nameIndexing = nameIndexing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPlaceNameIndexEntity that = (IaaPlaceNameIndexEntity) o;

        if (id != that.id) return false;
        if (dBasicTypeId != that.dBasicTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameIndexing != null ? !nameIndexing.equals(that.nameIndexing) : that.nameIndexing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + dBasicTypeId;
        result = 31 * result + (nameIndexing != null ? nameIndexing.hashCode() : 0);
        return result;
    }
}
