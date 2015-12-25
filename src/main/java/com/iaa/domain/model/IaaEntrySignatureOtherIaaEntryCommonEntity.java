package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_signature_other_iaa_entry_common", schema = "iaa", catalog = "")
public class IaaEntrySignatureOtherIaaEntryCommonEntity implements Serializable {
    private int entrySignatureId;
    private int entryCommonId;

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
    @Column(name = "entry_common_id")
    public int getEntryCommonId() {
        return entryCommonId;
    }

    public void setEntryCommonId(int entryCommonId) {
        this.entryCommonId = entryCommonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntrySignatureOtherIaaEntryCommonEntity that = (IaaEntrySignatureOtherIaaEntryCommonEntity) o;

        if (entrySignatureId != that.entrySignatureId) return false;
        if (entryCommonId != that.entryCommonId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entrySignatureId;
        result = 31 * result + entryCommonId;
        return result;
    }
}
