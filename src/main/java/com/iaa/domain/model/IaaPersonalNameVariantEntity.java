package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_personal_name_variant", schema = "iaa", catalog = "")
public class IaaPersonalNameVariantEntity implements Serializable {
    private int id;
    private String nameVariant;
    private int personalNameIndexId;
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
    @Column(name = "name_variant")
    public String getNameVariant() {
        return nameVariant;
    }

    public void setNameVariant(String nameVariant) {
        this.nameVariant = nameVariant;
    }

    @Basic
    @Column(name = "personal_name_index_id")
    public int getPersonalNameIndexId() {
        return personalNameIndexId;
    }

    public void setPersonalNameIndexId(int personalNameIndexId) {
        this.personalNameIndexId = personalNameIndexId;
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

        IaaPersonalNameVariantEntity that = (IaaPersonalNameVariantEntity) o;

        if (id != that.id) return false;
        if (personalNameIndexId != that.personalNameIndexId) return false;
        if (nameVariant != null ? !nameVariant.equals(that.nameVariant) : that.nameVariant != null) return false;
        if (nameVariantIndexing != null ? !nameVariantIndexing.equals(that.nameVariantIndexing) : that.nameVariantIndexing != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameVariant != null ? nameVariant.hashCode() : 0);
        result = 31 * result + personalNameIndexId;
        result = 31 * result + (nameVariantIndexing != null ? nameVariantIndexing.hashCode() : 0);
        return result;
    }
}
