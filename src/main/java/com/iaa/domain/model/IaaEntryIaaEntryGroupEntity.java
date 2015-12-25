package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_iaa_entry_group", schema = "iaa", catalog = "")
public class IaaEntryIaaEntryGroupEntity implements Serializable {
    private int entryUserGroupId;
    private int entryId;

    @Id
    @Basic
    @Column(name = "entry_user_group_id")
    public int getEntryUserGroupId() {
        return entryUserGroupId;
    }

    public void setEntryUserGroupId(int entryUserGroupId) {
        this.entryUserGroupId = entryUserGroupId;
    }

    @Id
    @Basic
    @Column(name = "entry_id")
    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryIaaEntryGroupEntity that = (IaaEntryIaaEntryGroupEntity) o;

        if (entryUserGroupId != that.entryUserGroupId) return false;
        if (entryId != that.entryId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryUserGroupId;
        result = 31 * result + entryId;
        return result;
    }
}
