package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_inscription", schema = "iaa", catalog = "")
public class IaaEntryInscriptionEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dProvidedId;
    private String inscriptionText;
    private int dTypeId;
    private int dSelId;
    private String author;
    private String address;
    private String exact;
    private String source;
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
    @Column(name = "inscription_text")
    public String getInscriptionText() {
        return inscriptionText;
    }

    public void setInscriptionText(String inscriptionText) {
        this.inscriptionText = inscriptionText;
    }

    @Basic
    @Column(name = "d_type_id")
    public int getdTypeId() {
        return dTypeId;
    }

    public void setdTypeId(int dTypeId) {
        this.dTypeId = dTypeId;
    }

    @Basic
    @Column(name = "d_sel_id")
    public int getdSelId() {
        return dSelId;
    }

    public void setdSelId(int dSelId) {
        this.dSelId = dSelId;
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
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

        IaaEntryInscriptionEntity that = (IaaEntryInscriptionEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (dTypeId != that.dTypeId) return false;
        if (dSelId != that.dSelId) return false;
        if (inscriptionText != null ? !inscriptionText.equals(that.inscriptionText) : that.inscriptionText != null)
            return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (exact != null ? !exact.equals(that.exact) : that.exact != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + (inscriptionText != null ? inscriptionText.hashCode() : 0);
        result = 31 * result + dTypeId;
        result = 31 * result + dSelId;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (exact != null ? exact.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
