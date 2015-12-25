package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_index_iaa_entry", schema = "iaa", catalog = "")
public class IaaIndexIaaEntryEntity implements Serializable {
    private int indexId;
    private String entry;

    @Id
    @Basic
    @Column(name = "index_id")
    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    @Id
    @Basic
    @Column(name = "entry")
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaIndexIaaEntryEntity that = (IaaIndexIaaEntryEntity) o;

        if (indexId != that.indexId) return false;
        if (entry != null ? !entry.equals(that.entry) : that.entry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = indexId;
        result = 31 * result + (entry != null ? entry.hashCode() : 0);
        return result;
    }
}
