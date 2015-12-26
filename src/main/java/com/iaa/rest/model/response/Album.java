package com.iaa.rest.model.response;

/**
 * Created by Peter Horvath on 2015. 12. 26..
 */
public class Album {
    private String ownerName;
    private String referenceNumber;
    private String numberOfEntries;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(String numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }
}
