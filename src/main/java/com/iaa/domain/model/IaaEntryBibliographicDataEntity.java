package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_entry_bibliographic_data", schema = "iaa", catalog = "")
public class IaaEntryBibliographicDataEntity implements Serializable {
    private int id;
    private int entryCommonId;
    private int dKnownId;
    private int locationId;
    private String referenceNum;
    private int dPageNumId;
    private String pageNum;
    private int albumLiteratureId;

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
    @Column(name = "d_known_id")
    public int getdKnownId() {
        return dKnownId;
    }

    public void setdKnownId(int dKnownId) {
        this.dKnownId = dKnownId;
    }

    @Basic
    @Column(name = "location_id")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "reference_num")
    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    @Basic
    @Column(name = "d_page_num_id")
    public int getdPageNumId() {
        return dPageNumId;
    }

    public void setdPageNumId(int dPageNumId) {
        this.dPageNumId = dPageNumId;
    }

    @Basic
    @Column(name = "page_num")
    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    @Basic
    @Column(name = "album_literature_id")
    public int getAlbumLiteratureId() {
        return albumLiteratureId;
    }

    public void setAlbumLiteratureId(int albumLiteratureId) {
        this.albumLiteratureId = albumLiteratureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryBibliographicDataEntity that = (IaaEntryBibliographicDataEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dKnownId != that.dKnownId) return false;
        if (locationId != that.locationId) return false;
        if (dPageNumId != that.dPageNumId) return false;
        if (albumLiteratureId != that.albumLiteratureId) return false;
        if (referenceNum != null ? !referenceNum.equals(that.referenceNum) : that.referenceNum != null) return false;
        if (pageNum != null ? !pageNum.equals(that.pageNum) : that.pageNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dKnownId;
        result = 31 * result + locationId;
        result = 31 * result + (referenceNum != null ? referenceNum.hashCode() : 0);
        result = 31 * result + dPageNumId;
        result = 31 * result + (pageNum != null ? pageNum.hashCode() : 0);
        result = 31 * result + albumLiteratureId;
        return result;
    }
}
