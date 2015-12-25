package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_place_name_variant", schema = "iaa", catalog = "")
public class IaaPlaceNameVariantEntity implements Serializable {
    private int id;
    private int placeNameIndexId;
    private String nameVariant;
    private String nameVariantIndexing;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "place_name_index_id")
    public int getPlaceNameIndexId() {
        return placeNameIndexId;
    }

    public void setPlaceNameIndexId(int placeNameIndexId) {
        this.placeNameIndexId = placeNameIndexId;
    }

    @Basic
    @Column(name = "name_variant")
    public String getNameVariant() {
        return nameVariant;
    }

    public void setNameVariant(String nameVariant) {
        this.nameVariant = nameVariant;
    }

    @Basic
    @Column(name = "name_variant_indexing")
    public String getNameVariantIndexing() {
        return nameVariantIndexing;
    }

    public void setNameVariantIndexing(String nameVariantIndexing) {
        this.nameVariantIndexing = nameVariantIndexing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPlaceNameVariantEntity that = (IaaPlaceNameVariantEntity) o;

        if (id != that.id) return false;
        if (placeNameIndexId != that.placeNameIndexId) return false;
        if (nameVariant != null ? !nameVariant.equals(that.nameVariant) : that.nameVariant != null) return false;
        if (nameVariantIndexing != null ? !nameVariantIndexing.equals(that.nameVariantIndexing) : that.nameVariantIndexing != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + placeNameIndexId;
        result = 31 * result + (nameVariant != null ? nameVariant.hashCode() : 0);
        result = 31 * result + (nameVariantIndexing != null ? nameVariantIndexing.hashCode() : 0);
        return result;
    }
}
