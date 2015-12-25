package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_dedication", schema = "iaa", catalog = "")
public class IaaEntryDedicationEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private int ownerNameId;
    private String ownerNameAppears;
    private String ownerTitle;
    private String ownerPlaceOfOrig;
    private int addId;
    private String note;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entry_common_id")
    public int getEntryCommonId() {
        return entryCommonId;
    }

    public void setEntryCommonId(int entryCommonId) {
        this.entryCommonId = entryCommonId;
    }

    @Basic
    @Column(name = "d_provided_id")
    public int getdProvidedId() {
        return dProvidedId;
    }

    public void setdProvidedId(int dProvidedId) {
        this.dProvidedId = dProvidedId;
    }

    @Basic
    @Column(name = "owner_name_id")
    public int getOwnerNameId() {
        return ownerNameId;
    }

    public void setOwnerNameId(int ownerNameId) {
        this.ownerNameId = ownerNameId;
    }

    @Basic
    @Column(name = "owner_name_appears")
    public String getOwnerNameAppears() {
        return ownerNameAppears;
    }

    public void setOwnerNameAppears(String ownerNameAppears) {
        this.ownerNameAppears = ownerNameAppears;
    }

    @Basic
    @Column(name = "owner_title")
    public String getOwnerTitle() {
        return ownerTitle;
    }

    public void setOwnerTitle(String ownerTitle) {
        this.ownerTitle = ownerTitle;
    }

    @Basic
    @Column(name = "owner_place_of_orig")
    public String getOwnerPlaceOfOrig() {
        return ownerPlaceOfOrig;
    }

    public void setOwnerPlaceOfOrig(String ownerPlaceOfOrig) {
        this.ownerPlaceOfOrig = ownerPlaceOfOrig;
    }

    @Basic
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryDedicationEntity that = (IaaEntryDedicationEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (ownerNameId != that.ownerNameId) return false;
        if (addId != that.addId) return false;
        if (ownerNameAppears != null ? !ownerNameAppears.equals(that.ownerNameAppears) : that.ownerNameAppears != null)
            return false;
        if (ownerTitle != null ? !ownerTitle.equals(that.ownerTitle) : that.ownerTitle != null) return false;
        if (ownerPlaceOfOrig != null ? !ownerPlaceOfOrig.equals(that.ownerPlaceOfOrig) : that.ownerPlaceOfOrig != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + ownerNameId;
        result = 31 * result + (ownerNameAppears != null ? ownerNameAppears.hashCode() : 0);
        result = 31 * result + (ownerTitle != null ? ownerTitle.hashCode() : 0);
        result = 31 * result + (ownerPlaceOfOrig != null ? ownerPlaceOfOrig.hashCode() : 0);
        result = 31 * result + addId;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
