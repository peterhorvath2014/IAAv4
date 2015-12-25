package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_dedication_origin_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntryDedicationOriginIaaDictionaryEntity implements Serializable {
    private int entryDedicationId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_dedication_id")
    public int getEntryDedicationId() {
        return entryDedicationId;
    }

    public void setEntryDedicationId(int entryDedicationId) {
        this.entryDedicationId = entryDedicationId;
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

        IaaEntryDedicationOriginIaaDictionaryEntity that = (IaaEntryDedicationOriginIaaDictionaryEntity) o;

        if (entryDedicationId != that.entryDedicationId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryDedicationId;
        result = 31 * result + dLangId;
        return result;
    }
}
