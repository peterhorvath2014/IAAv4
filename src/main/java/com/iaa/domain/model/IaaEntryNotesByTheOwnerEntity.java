package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_notes_by_the_owner", schema = "iaa", catalog = "")
public class IaaEntryNotesByTheOwnerEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private String notesByTheOwner;
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
    @Column(name = "notes_by_the_owner")
    public String getNotesByTheOwner() {
        return notesByTheOwner;
    }

    public void setNotesByTheOwner(String notesByTheOwner) {
        this.notesByTheOwner = notesByTheOwner;
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

        IaaEntryNotesByTheOwnerEntity that = (IaaEntryNotesByTheOwnerEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (notesByTheOwner != null ? !notesByTheOwner.equals(that.notesByTheOwner) : that.notesByTheOwner != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + (notesByTheOwner != null ? notesByTheOwner.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
