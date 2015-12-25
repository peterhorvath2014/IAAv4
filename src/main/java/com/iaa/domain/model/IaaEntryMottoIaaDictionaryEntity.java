package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_motto_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntryMottoIaaDictionaryEntity implements Serializable {
    private int entryMottoId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_motto_id")
    public int getEntryMottoId() {
        return entryMottoId;
    }

    public void setEntryMottoId(int entryMottoId) {
        this.entryMottoId = entryMottoId;
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

        IaaEntryMottoIaaDictionaryEntity that = (IaaEntryMottoIaaDictionaryEntity) o;

        if (entryMottoId != that.entryMottoId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryMottoId;
        result = 31 * result + dLangId;
        return result;
    }
}
