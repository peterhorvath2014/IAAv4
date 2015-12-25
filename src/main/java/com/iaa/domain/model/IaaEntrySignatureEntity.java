package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_signature", schema = "iaa", catalog = "")
public class IaaEntrySignatureEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private int inscriberNameId;
    private String inscriberSignature;
    private String inscriberTitle;
    private String inscriberPlaceOfOrig;
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
    @Column(name = "inscriber_name_id")
    public int getInscriberNameId() {
        return inscriberNameId;
    }

    public void setInscriberNameId(int inscriberNameId) {
        this.inscriberNameId = inscriberNameId;
    }

    @Basic
    @Column(name = "inscriber_signature")
    public String getInscriberSignature() {
        return inscriberSignature;
    }

    public void setInscriberSignature(String inscriberSignature) {
        this.inscriberSignature = inscriberSignature;
    }

    @Basic
    @Column(name = "inscriber_title")
    public String getInscriberTitle() {
        return inscriberTitle;
    }

    public void setInscriberTitle(String inscriberTitle) {
        this.inscriberTitle = inscriberTitle;
    }

    @Basic
    @Column(name = "inscriber_place_of_orig")
    public String getInscriberPlaceOfOrig() {
        return inscriberPlaceOfOrig;
    }

    public void setInscriberPlaceOfOrig(String inscriberPlaceOfOrig) {
        this.inscriberPlaceOfOrig = inscriberPlaceOfOrig;
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

        IaaEntrySignatureEntity that = (IaaEntrySignatureEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (inscriberNameId != that.inscriberNameId) return false;
        if (addId != that.addId) return false;
        if (inscriberSignature != null ? !inscriberSignature.equals(that.inscriberSignature) : that.inscriberSignature != null)
            return false;
        if (inscriberTitle != null ? !inscriberTitle.equals(that.inscriberTitle) : that.inscriberTitle != null)
            return false;
        if (inscriberPlaceOfOrig != null ? !inscriberPlaceOfOrig.equals(that.inscriberPlaceOfOrig) : that.inscriberPlaceOfOrig != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + inscriberNameId;
        result = 31 * result + (inscriberSignature != null ? inscriberSignature.hashCode() : 0);
        result = 31 * result + (inscriberTitle != null ? inscriberTitle.hashCode() : 0);
        result = 31 * result + (inscriberPlaceOfOrig != null ? inscriberPlaceOfOrig.hashCode() : 0);
        result = 31 * result + addId;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
