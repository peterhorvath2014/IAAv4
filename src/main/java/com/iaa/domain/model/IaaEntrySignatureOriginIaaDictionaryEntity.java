package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_signature_origin_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntrySignatureOriginIaaDictionaryEntity implements Serializable {
    private int entrySignatureId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_signature_id")
    public int getEntrySignatureId() {
        return entrySignatureId;
    }

    public void setEntrySignatureId(int entrySignatureId) {
        this.entrySignatureId = entrySignatureId;
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

        IaaEntrySignatureOriginIaaDictionaryEntity that = (IaaEntrySignatureOriginIaaDictionaryEntity) o;

        if (entrySignatureId != that.entrySignatureId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entrySignatureId;
        result = 31 * result + dLangId;
        return result;
    }
}
