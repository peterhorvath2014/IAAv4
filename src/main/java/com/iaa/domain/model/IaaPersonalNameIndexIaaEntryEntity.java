package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_personal_name_index_iaa_entry", schema = "iaa", catalog = "")
public class IaaPersonalNameIndexIaaEntryEntity implements Serializable {
    private int entryId;
    private int personalNameIndexId;

    @Id
    @Basic
    @Column(name = "entry_id")
    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    @Id
    @Basic
    @Column(name = "personal_name_index_id")
    public int getPersonalNameIndexId() {
        return personalNameIndexId;
    }

    public void setPersonalNameIndexId(int personalNameIndexId) {
        this.personalNameIndexId = personalNameIndexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPersonalNameIndexIaaEntryEntity that = (IaaPersonalNameIndexIaaEntryEntity) o;

        if (entryId != that.entryId) return false;
        if (personalNameIndexId != that.personalNameIndexId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryId;
        result = 31 * result + personalNameIndexId;
        return result;
    }
}
