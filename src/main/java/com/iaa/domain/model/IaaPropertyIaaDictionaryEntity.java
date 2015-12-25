package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_property_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaPropertyIaaDictionaryEntity implements Serializable {
    private int iaaPropertyId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "iaa_property_id")
    public int getIaaPropertyId() {
        return iaaPropertyId;
    }

    public void setIaaPropertyId(int iaaPropertyId) {
        this.iaaPropertyId = iaaPropertyId;
    }

    @Id
    @Basic
    @Column(name = "d_lang_id")
    public int getdLangId() {
        return dLangId;
    }

    public void setdLangId(int dLangId) {
        this.dLangId = dLangId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPropertyIaaDictionaryEntity that = (IaaPropertyIaaDictionaryEntity) o;

        if (iaaPropertyId != that.iaaPropertyId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iaaPropertyId;
        result = 31 * result + dLangId;
        return result;
    }
}
