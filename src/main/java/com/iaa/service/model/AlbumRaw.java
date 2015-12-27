package com.iaa.service.model;

import com.iaa.domain.model.IaaEntryBibliographicDataEntity;

/**
 * Created by Peter Horvath on 2015. 12. 27..
 */
public class AlbumRaw {
    private final int locationId;
    private final String referenceNum;

    public AlbumRaw(IaaEntryBibliographicDataEntity entryBibliographicDataEntity) {
        this.locationId = entryBibliographicDataEntity.getLocationId();
        this.referenceNum = entryBibliographicDataEntity.getReferenceNum();
    }

    public AlbumRaw(int locationId, String referenceNum) {
        this.locationId = locationId;
        this.referenceNum = referenceNum;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlbumRaw albumRaw = (AlbumRaw) o;

        if (locationId != albumRaw.locationId) return false;
        return referenceNum != null ? referenceNum.equals(albumRaw.referenceNum) : albumRaw.referenceNum == null;

    }

    @Override
    public int hashCode() {
        int result = locationId;
        result = 31 * result + (referenceNum != null ? referenceNum.hashCode() : 0);
        return result;
    }
}

