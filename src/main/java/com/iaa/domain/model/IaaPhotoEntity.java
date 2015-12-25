package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_photo", schema = "iaa", catalog = "")
public class IaaPhotoEntity implements Serializable {
    private int id;
    private int idEntry;
    private String fileNameOnDrive;
    private String fileNameOriginal;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_entry")
    public int getIdEntry() {
        return idEntry;
    }

    public void setIdEntry(int idEntry) {
        this.idEntry = idEntry;
    }

    @Basic
    @Column(name = "file_name_on_drive")
    public String getFileNameOnDrive() {
        return fileNameOnDrive;
    }

    public void setFileNameOnDrive(String fileNameOnDrive) {
        this.fileNameOnDrive = fileNameOnDrive;
    }

    @Basic
    @Column(name = "file_name_original")
    public String getFileNameOriginal() {
        return fileNameOriginal;
    }

    public void setFileNameOriginal(String fileNameOriginal) {
        this.fileNameOriginal = fileNameOriginal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaPhotoEntity that = (IaaPhotoEntity) o;

        if (id != that.id) return false;
        if (idEntry != that.idEntry) return false;
        if (fileNameOnDrive != null ? !fileNameOnDrive.equals(that.fileNameOnDrive) : that.fileNameOnDrive != null)
            return false;
        if (fileNameOriginal != null ? !fileNameOriginal.equals(that.fileNameOriginal) : that.fileNameOriginal != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idEntry;
        result = 31 * result + (fileNameOnDrive != null ? fileNameOnDrive.hashCode() : 0);
        result = 31 * result + (fileNameOriginal != null ? fileNameOriginal.hashCode() : 0);
        return result;
    }
}
