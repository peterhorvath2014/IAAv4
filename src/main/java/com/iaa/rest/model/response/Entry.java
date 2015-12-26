package com.iaa.rest.model.response;

import java.time.LocalDate;

/**
 * Created by Peter Horvath on 2015. 12. 26..
 */
public class Entry {
    private String date;
    private String placeName;
    private String inscriberName;
    private String entryId;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getInscriberName() {
        return inscriberName;
    }

    public void setInscriberName(String inscriberName) {
        this.inscriberName = inscriberName;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }
}
