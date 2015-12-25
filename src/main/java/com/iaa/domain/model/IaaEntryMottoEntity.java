package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_motto", schema = "iaa", catalog = "")
public class IaaEntryMottoEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private String motto;
    private int addId;
    private int dMottoSourceKnown;
    private String author;
    private String address;
    private String exact;
    private String sourceReference;
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
    @Column(name = "motto")
    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
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
    @Column(name = "d_motto_source_known")
    public int getdMottoSourceKnown() {
        return dMottoSourceKnown;
    }

    public void setdMottoSourceKnown(int dMottoSourceKnown) {
        this.dMottoSourceKnown = dMottoSourceKnown;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "exact")
    public String getExact() {
        return exact;
    }

    public void setExact(String exact) {
        this.exact = exact;
    }

    @Basic
    @Column(name = "source_reference")
    public String getSourceReference() {
        return sourceReference;
    }

    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
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

        IaaEntryMottoEntity that = (IaaEntryMottoEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (addId != that.addId) return false;
        if (dMottoSourceKnown != that.dMottoSourceKnown) return false;
        if (motto != null ? !motto.equals(that.motto) : that.motto != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (exact != null ? !exact.equals(that.exact) : that.exact != null) return false;
        if (sourceReference != null ? !sourceReference.equals(that.sourceReference) : that.sourceReference != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + (motto != null ? motto.hashCode() : 0);
        result = 31 * result + addId;
        result = 31 * result + dMottoSourceKnown;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (exact != null ? exact.hashCode() : 0);
        result = 31 * result + (sourceReference != null ? sourceReference.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
