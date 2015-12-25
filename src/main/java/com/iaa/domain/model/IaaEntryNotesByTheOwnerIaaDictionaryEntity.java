package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_notes_by_the_owner_iaa_dictionary", schema = "iaa", catalog = "")
public class IaaEntryNotesByTheOwnerIaaDictionaryEntity implements Serializable {
    private int entryNotesByTheOwnerId;
    private int dLangId;

    @Id
    @Basic
    @Column(name = "entry_notes_by_the_owner_id")
    public int getEntryNotesByTheOwnerId() {
        return entryNotesByTheOwnerId;
    }

    public void setEntryNotesByTheOwnerId(int entryNotesByTheOwnerId) {
        this.entryNotesByTheOwnerId = entryNotesByTheOwnerId;
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

        IaaEntryNotesByTheOwnerIaaDictionaryEntity that = (IaaEntryNotesByTheOwnerIaaDictionaryEntity) o;

        if (entryNotesByTheOwnerId != that.entryNotesByTheOwnerId) return false;
        if (dLangId != that.dLangId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryNotesByTheOwnerId;
        result = 31 * result + dLangId;
        return result;
    }
}
