package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_album_literature", schema = "iaa", catalog = "")
public class IaaAlbumLiteratureEntity implements Serializable {
    private int id;
    private String literature;
    private String bibliographicData;
    private String generalComments;

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
    @Column(name = "bibliographic_data")
    public String getBibliographicData() {
        return bibliographicData;
    }

    public void setBibliographicData(String bibliographicData) {
        this.bibliographicData = bibliographicData;
    }

    @Basic
    @Column(name = "general_comments")
    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaAlbumLiteratureEntity that = (IaaAlbumLiteratureEntity) o;

        if (id != that.id) return false;
        if (literature != null ? !literature.equals(that.literature) : that.literature != null) return false;
        if (bibliographicData != null ? !bibliographicData.equals(that.bibliographicData) : that.bibliographicData != null)
            return false;
        if (generalComments != null ? !generalComments.equals(that.generalComments) : that.generalComments != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (literature != null ? literature.hashCode() : 0);
        result = 31 * result + (bibliographicData != null ? bibliographicData.hashCode() : 0);
        result = 31 * result + (generalComments != null ? generalComments.hashCode() : 0);
        return result;
    }
}
