package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_inscription_property", schema = "iaa", catalog = "")
public class IaaInscriptionPropertyEntity implements Serializable {
    private int id;
    private int dTypeId;
    private int dLangId;
    private Byte check;
    private int dSelId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "d_lang_id")
    public int getdLangId() {
        return dLangId;
    }

    public void setdLangId(int dLangId) {
        this.dLangId = dLangId;
    }

    @Basic
    @Column(name = "check")
    public Byte getCheck() {
        return check;
    }

    public void setCheck(Byte check) {
        this.check = check;
    }

    @Basic
    @Column(name = "d_sel_id")
    public int getdSelId() {
        return dSelId;
    }

    public void setdSelId(int dSelId) {
        this.dSelId = dSelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaInscriptionPropertyEntity that = (IaaInscriptionPropertyEntity) o;

        if (id != that.id) return false;
        if (dTypeId != that.dTypeId) return false;
        if (dLangId != that.dLangId) return false;
        if (dSelId != that.dSelId) return false;
        if (check != null ? !check.equals(that.check) : that.check != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + dTypeId;
        result = 31 * result + dLangId;
        result = 31 * result + (check != null ? check.hashCode() : 0);
        result = 31 * result + dSelId;
        return result;
    }
}
