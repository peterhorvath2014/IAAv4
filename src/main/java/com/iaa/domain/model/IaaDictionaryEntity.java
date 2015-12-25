package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_dictionary", schema = "iaa", catalog = "")
public class IaaDictionaryEntity implements Serializable {
    private int id;
    private String code;
    private int groupId;
    private Integer ordering;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "group_id")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "ordering")
    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaDictionaryEntity that = (IaaDictionaryEntity) o;

        if (id != that.id) return false;
        if (groupId != that.groupId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (ordering != null ? !ordering.equals(that.ordering) : that.ordering != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + (ordering != null ? ordering.hashCode() : 0);
        return result;
    }
}
