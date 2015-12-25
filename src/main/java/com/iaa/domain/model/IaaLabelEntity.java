package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_label", schema = "iaa", catalog = "")
public class IaaLabelEntity implements Serializable {
    private int id;
    private String code;
    private String label;
    private int dLangId;
    private int dBlockId;
    private Serializable editor;

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
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
    @Column(name = "d_block_id")
    public int getdBlockId() {
        return dBlockId;
    }

    public void setdBlockId(int dBlockId) {
        this.dBlockId = dBlockId;
    }

    @Basic
    @Column(name = "editor")
    public Serializable getEditor() {
        return editor;
    }

    public void setEditor(Serializable editor) {
        this.editor = editor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaLabelEntity that = (IaaLabelEntity) o;

        if (id != that.id) return false;
        if (dLangId != that.dLangId) return false;
        if (dBlockId != that.dBlockId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (editor != null ? !editor.equals(that.editor) : that.editor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + dLangId;
        result = 31 * result + dBlockId;
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        return result;
    }
}
