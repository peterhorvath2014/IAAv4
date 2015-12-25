package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_common", schema = "iaa", catalog = "")
public class IaaEntryCommonEntity implements Serializable {
    private int id;
    private int dLangId;
    private int creatorUserId;
    private Timestamp creatingTimestamp;
    private int modifierUserId;
    private Timestamp modifyingTimestamp;
    private byte status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "d_lang_id")
    public int getdLangId() {
        return dLangId;
    }

    public void setdLangId(int dLangId) {
        this.dLangId = dLangId;
    }

    @Basic
    @Column(name = "creator_user_id")
    public int getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(int creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @Basic
    @Column(name = "creating_timestamp")
    public Timestamp getCreatingTimestamp() {
        return creatingTimestamp;
    }

    public void setCreatingTimestamp(Timestamp creatingTimestamp) {
        this.creatingTimestamp = creatingTimestamp;
    }

    @Basic
    @Column(name = "modifier_user_id")
    public int getModifierUserId() {
        return modifierUserId;
    }

    public void setModifierUserId(int modifierUserId) {
        this.modifierUserId = modifierUserId;
    }

    @Basic
    @Column(name = "modifying_timestamp")
    public Timestamp getModifyingTimestamp() {
        return modifyingTimestamp;
    }

    public void setModifyingTimestamp(Timestamp modifyingTimestamp) {
        this.modifyingTimestamp = modifyingTimestamp;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryCommonEntity that = (IaaEntryCommonEntity) o;

        if (id != that.id) return false;
        if (dLangId != that.dLangId) return false;
        if (creatorUserId != that.creatorUserId) return false;
        if (modifierUserId != that.modifierUserId) return false;
        if (status != that.status) return false;
        if (creatingTimestamp != null ? !creatingTimestamp.equals(that.creatingTimestamp) : that.creatingTimestamp != null)
            return false;
        if (modifyingTimestamp != null ? !modifyingTimestamp.equals(that.modifyingTimestamp) : that.modifyingTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + dLangId;
        result = 31 * result + creatorUserId;
        result = 31 * result + (creatingTimestamp != null ? creatingTimestamp.hashCode() : 0);
        result = 31 * result + modifierUserId;
        result = 31 * result + (modifyingTimestamp != null ? modifyingTimestamp.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}
