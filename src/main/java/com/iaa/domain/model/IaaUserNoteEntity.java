package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_user_note", schema = "iaa", catalog = "")
public class IaaUserNoteEntity implements Serializable {
    private int id;
    private int userId;
    private Integer entryUserGroupId;
    private Integer entryCommonId;
    private Integer entryDateId;
    private Integer entryPlaceOfDatingId;
    private Integer entryMottoId;
    private Integer entryIllustrationId;
    private Integer entryDedicationId;
    private Integer entrySignatureId;
    private Integer entryNotesByTheOwnerId;
    private Integer entryInscriptionId;
    private int entryBibliographicDataId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "entry_user_group_id")
    public Integer getEntryUserGroupId() {
        return entryUserGroupId;
    }

    public void setEntryUserGroupId(Integer entryUserGroupId) {
        this.entryUserGroupId = entryUserGroupId;
    }

    @Basic
    @Column(name = "entry_common_id")
    public Integer getEntryCommonId() {
        return entryCommonId;
    }

    public void setEntryCommonId(Integer entryCommonId) {
        this.entryCommonId = entryCommonId;
    }

    @Basic
    @Column(name = "entry_date_id")
    public Integer getEntryDateId() {
        return entryDateId;
    }

    public void setEntryDateId(Integer entryDateId) {
        this.entryDateId = entryDateId;
    }

    @Basic
    @Column(name = "entry_place_of_dating_id")
    public Integer getEntryPlaceOfDatingId() {
        return entryPlaceOfDatingId;
    }

    public void setEntryPlaceOfDatingId(Integer entryPlaceOfDatingId) {
        this.entryPlaceOfDatingId = entryPlaceOfDatingId;
    }

    @Basic
    @Column(name = "entry_motto_id")
    public Integer getEntryMottoId() {
        return entryMottoId;
    }

    public void setEntryMottoId(Integer entryMottoId) {
        this.entryMottoId = entryMottoId;
    }

    @Basic
    @Column(name = "entry_illustration_id")
    public Integer getEntryIllustrationId() {
        return entryIllustrationId;
    }

    public void setEntryIllustrationId(Integer entryIllustrationId) {
        this.entryIllustrationId = entryIllustrationId;
    }

    @Basic
    @Column(name = "entry_dedication_id")
    public Integer getEntryDedicationId() {
        return entryDedicationId;
    }

    public void setEntryDedicationId(Integer entryDedicationId) {
        this.entryDedicationId = entryDedicationId;
    }

    @Basic
    @Column(name = "entry_signature_id")
    public Integer getEntrySignatureId() {
        return entrySignatureId;
    }

    public void setEntrySignatureId(Integer entrySignatureId) {
        this.entrySignatureId = entrySignatureId;
    }

    @Basic
    @Column(name = "entry_notes_by_the_owner_id")
    public Integer getEntryNotesByTheOwnerId() {
        return entryNotesByTheOwnerId;
    }

    public void setEntryNotesByTheOwnerId(Integer entryNotesByTheOwnerId) {
        this.entryNotesByTheOwnerId = entryNotesByTheOwnerId;
    }

    @Basic
    @Column(name = "entry_inscription_id")
    public Integer getEntryInscriptionId() {
        return entryInscriptionId;
    }

    public void setEntryInscriptionId(Integer entryInscriptionId) {
        this.entryInscriptionId = entryInscriptionId;
    }

    @Basic
    @Column(name = "entry_bibliographic_data_id")
    public int getEntryBibliographicDataId() {
        return entryBibliographicDataId;
    }

    public void setEntryBibliographicDataId(int entryBibliographicDataId) {
        this.entryBibliographicDataId = entryBibliographicDataId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaUserNoteEntity that = (IaaUserNoteEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (entryBibliographicDataId != that.entryBibliographicDataId) return false;
        if (entryUserGroupId != null ? !entryUserGroupId.equals(that.entryUserGroupId) : that.entryUserGroupId != null)
            return false;
        if (entryCommonId != null ? !entryCommonId.equals(that.entryCommonId) : that.entryCommonId != null)
            return false;
        if (entryDateId != null ? !entryDateId.equals(that.entryDateId) : that.entryDateId != null) return false;
        if (entryPlaceOfDatingId != null ? !entryPlaceOfDatingId.equals(that.entryPlaceOfDatingId) : that.entryPlaceOfDatingId != null)
            return false;
        if (entryMottoId != null ? !entryMottoId.equals(that.entryMottoId) : that.entryMottoId != null) return false;
        if (entryIllustrationId != null ? !entryIllustrationId.equals(that.entryIllustrationId) : that.entryIllustrationId != null)
            return false;
        if (entryDedicationId != null ? !entryDedicationId.equals(that.entryDedicationId) : that.entryDedicationId != null)
            return false;
        if (entrySignatureId != null ? !entrySignatureId.equals(that.entrySignatureId) : that.entrySignatureId != null)
            return false;
        if (entryNotesByTheOwnerId != null ? !entryNotesByTheOwnerId.equals(that.entryNotesByTheOwnerId) : that.entryNotesByTheOwnerId != null)
            return false;
        if (entryInscriptionId != null ? !entryInscriptionId.equals(that.entryInscriptionId) : that.entryInscriptionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (entryUserGroupId != null ? entryUserGroupId.hashCode() : 0);
        result = 31 * result + (entryCommonId != null ? entryCommonId.hashCode() : 0);
        result = 31 * result + (entryDateId != null ? entryDateId.hashCode() : 0);
        result = 31 * result + (entryPlaceOfDatingId != null ? entryPlaceOfDatingId.hashCode() : 0);
        result = 31 * result + (entryMottoId != null ? entryMottoId.hashCode() : 0);
        result = 31 * result + (entryIllustrationId != null ? entryIllustrationId.hashCode() : 0);
        result = 31 * result + (entryDedicationId != null ? entryDedicationId.hashCode() : 0);
        result = 31 * result + (entrySignatureId != null ? entrySignatureId.hashCode() : 0);
        result = 31 * result + (entryNotesByTheOwnerId != null ? entryNotesByTheOwnerId.hashCode() : 0);
        result = 31 * result + (entryInscriptionId != null ? entryInscriptionId.hashCode() : 0);
        result = 31 * result + entryBibliographicDataId;
        return result;
    }
}
