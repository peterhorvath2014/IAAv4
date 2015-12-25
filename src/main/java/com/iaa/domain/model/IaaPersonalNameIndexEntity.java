package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_personal_name_index", schema = "iaa", catalog = "")
public class IaaPersonalNameIndexEntity implements Serializable {
    private int id;
    private String literature;
    private String number;
    private String familyNameOrigin;
    private String familyName;
    private String firstName;
    private int dBasicTypeId;
    private int dCitizenshipId;
    private String fullName;
    private String nameIndexing;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "literature")
    public String getLiterature() {
        return literature;
    }

    public void setLiterature(String literature) {
        this.literature = literature;
    }

    @Basic
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "family_name_origin")
    public String getFamilyNameOrigin() {
        return familyNameOrigin;
    }

    public void setFamilyNameOrigin(String familyNameOrigin) {
        this.familyNameOrigin = familyNameOrigin;
    }

    @Basic
    @Column(name = "family_name")
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "d_basic_type_id")
    public int getdBasicTypeId() {
        return dBasicTypeId;
    }

    public void setdBasicTypeId(int dBasicTypeId) {
        this.dBasicTypeId = dBasicTypeId;
    }

    @Basic
    @Column(name = "d_citizenship_id")
    public int getdCitizenshipId() {
        return dCitizenshipId;
    }

    public void setdCitizenshipId(int dCitizenshipId) {
        this.dCitizenshipId = dCitizenshipId;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "name_indexing")
    public String getNameIndexing() {
        return nameIndexing;
    }

    public void setNameIndexing(String nameIndexing) {
        this.nameIndexing = nameIndexing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPersonalNameIndexEntity that = (IaaPersonalNameIndexEntity) o;

        if (id != that.id) return false;
        if (dBasicTypeId != that.dBasicTypeId) return false;
        if (dCitizenshipId != that.dCitizenshipId) return false;
        if (literature != null ? !literature.equals(that.literature) : that.literature != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (familyNameOrigin != null ? !familyNameOrigin.equals(that.familyNameOrigin) : that.familyNameOrigin != null)
            return false;
        if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (nameIndexing != null ? !nameIndexing.equals(that.nameIndexing) : that.nameIndexing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (literature != null ? literature.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (familyNameOrigin != null ? familyNameOrigin.hashCode() : 0);
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + dBasicTypeId;
        result = 31 * result + dCitizenshipId;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (nameIndexing != null ? nameIndexing.hashCode() : 0);
        return result;
    }
}
