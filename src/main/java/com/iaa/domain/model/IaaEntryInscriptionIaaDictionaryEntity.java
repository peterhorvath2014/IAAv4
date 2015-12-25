package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_inscription_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntryInscriptionIaaDictionaryEntity implements Serializable {
    private int entryInscriptionId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_inscription_id")
    public int getEntryInscriptionId() {
        return entryInscriptionId;
    }

    public void setEntryInscriptionId(int entryInscriptionId) {
        this.entryInscriptionId = entryInscriptionId;
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

        IaaEntryInscriptionIaaDictionaryEntity that = (IaaEntryInscriptionIaaDictionaryEntity) o;

        if (entryInscriptionId != that.entryInscriptionId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryInscriptionId;
        result = 31 * result + dLangId;
        return result;
    }
}
