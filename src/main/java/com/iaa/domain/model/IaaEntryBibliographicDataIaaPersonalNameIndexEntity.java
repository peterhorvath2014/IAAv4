package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_bibliographic_data_iaa_personal_name_index", schema = "iaa", catalog = "")
public class IaaEntryBibliographicDataIaaPersonalNameIndexEntity implements Serializable {
    private int personalNameIndexId;
    private int iaaEntryBibliographicDataId;

    @Id
    @Basic
    @Column(name = "personal_name_index_id")
    public int getPersonalNameIndexId() {
        return personalNameIndexId;
    }

    public void setPersonalNameIndexId(int personalNameIndexId) {
        this.personalNameIndexId = personalNameIndexId;
    }

    @Id
    @Basic
    @Column(name = "iaa_entry_bibliographic_data_id")
    public int getIaaEntryBibliographicDataId() {
        return iaaEntryBibliographicDataId;
    }

    public void setIaaEntryBibliographicDataId(int iaaEntryBibliographicDataId) {
        this.iaaEntryBibliographicDataId = iaaEntryBibliographicDataId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryBibliographicDataIaaPersonalNameIndexEntity that = (IaaEntryBibliographicDataIaaPersonalNameIndexEntity) o;

        if (personalNameIndexId != that.personalNameIndexId) return false;
        if (iaaEntryBibliographicDataId != that.iaaEntryBibliographicDataId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personalNameIndexId;
        result = 31 * result + iaaEntryBibliographicDataId;
        return result;
    }
}
