package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_additional_text", schema = "iaa", catalog = "")
public class IaaEntryAdditionalTextEntity implements Serializable {
    private int id;
    private String addText;
    private int dAddProvidedId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "add_text")
    public String getAddText() {
        return addText;
    }

    public void setAddText(String addText) {
        this.addText = addText;
    }

    @Basic
    @Column(name = "d_add_provided_id")
    public int getdAddProvidedId() {
        return dAddProvidedId;
    }

    public void setdAddProvidedId(int dAddProvidedId) {
        this.dAddProvidedId = dAddProvidedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryAdditionalTextEntity that = (IaaEntryAdditionalTextEntity) o;

        if (id != that.id) return false;
        if (dAddProvidedId != that.dAddProvidedId) return false;
        if (addText != null ? !addText.equals(that.addText) : that.addText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (addText != null ? addText.hashCode() : 0);
        result = 31 * result + dAddProvidedId;
        return result;
    }
}
