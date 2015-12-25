package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_dictionary_names", schema = "iaa", catalog = "")
public class IaaDictionaryNamesEntity implements Serializable {
    private int id;
    private int dDictionaryId;
    private int dLangId;
    private String name;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "d_dictionary_id")
    public int getdDictionaryId() {
        return dDictionaryId;
    }

    public void setdDictionaryId(int dDictionaryId) {
        this.dDictionaryId = dDictionaryId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaDictionaryNamesEntity that = (IaaDictionaryNamesEntity) o;

        if (id != that.id) return false;
        if (dDictionaryId != that.dDictionaryId) return false;
        if (dLangId != that.dLangId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + dDictionaryId;
        result = 31 * result + dLangId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
