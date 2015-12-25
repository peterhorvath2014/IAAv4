package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_additional_text_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntryAdditionalTextIaaDictionaryEntity implements Serializable {
    private int entryAdditionalTextId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_additional_text_id")
    public int getEntryAdditionalTextId() {
        return entryAdditionalTextId;
    }

    public void setEntryAdditionalTextId(int entryAdditionalTextId) {
        this.entryAdditionalTextId = entryAdditionalTextId;
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

        IaaEntryAdditionalTextIaaDictionaryEntity that = (IaaEntryAdditionalTextIaaDictionaryEntity) o;

        if (entryAdditionalTextId != that.entryAdditionalTextId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryAdditionalTextId;
        result = 31 * result + dLangId;
        return result;
    }
}
