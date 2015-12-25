package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_property", schema = "iaa", catalog = "")
public class IaaPropertyEntity implements Serializable {
    private int id;
    private String propertyText;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "property_text")
    public String getPropertyText() {
        return propertyText;
    }

    public void setPropertyText(String propertyText) {
        this.propertyText = propertyText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPropertyEntity that = (IaaPropertyEntity) o;

        if (id != that.id) return false;
        if (propertyText != null ? !propertyText.equals(that.propertyText) : that.propertyText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (propertyText != null ? propertyText.hashCode() : 0);
        return result;
    }
}
