package com.iaa.domain.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@javax.persistence.Table(name = "iaa_entry_date", schema = "iaa", catalog = "")
public class IaaEntryDateEntity implements Serializable {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int entryCommonId;

    @Basic
    @javax.persistence.Column(name = "entry_common_id")
    public int getEntryCommonId() {
        return entryCommonId;
    }

    public void setEntryCommonId(int entryCommonId) {
        this.entryCommonId = entryCommonId;
    }

    private int dProvidedId;

    @Basic
    @javax.persistence.Column(name = "d_provided_id")
    public int getdProvidedId() {
        return dProvidedId;
    }

    public void setdProvidedId(int dProvidedId) {
        this.dProvidedId = dProvidedId;
    }

    private int dDatePreSelectorId;

    @Basic
    @javax.persistence.Column(name = "d_date_pre_selector_id")
    public int getdDatePreSelectorId() {
        return dDatePreSelectorId;
    }

    public void setdDatePreSelectorId(int dDatePreSelectorId) {
        this.dDatePreSelectorId = dDatePreSelectorId;
    }

    private String FromYear;

    @Basic
    @javax.persistence.Column(name = "1_year")
    public String getFromYear() {
        return FromYear;
    }

    public void setFromYear(String fromYear) {
        FromYear = fromYear;
    }

    private String FromMonth;

    @Basic
    @javax.persistence.Column(name = "1_month")
    public String getFromMonth() {
        return FromMonth;
    }

    public void setFromMonth(String fromMonth) {
        FromMonth = fromMonth;
    }

    private String FromDay;

    @Basic
    @javax.persistence.Column(name = "1_day")
    public String getFromDay() {
        return FromDay;
    }

    public void setFromDay(String fromDay) {
        FromDay = fromDay;
    }

    private String ToYear;

    @Basic
    @javax.persistence.Column(name = "2_year")
    public String getToYear() {
        return ToYear;
    }

    public void setToYear(String toYear) {
        ToYear = toYear;
    }

    private String ToMonth;

    @Basic
    @javax.persistence.Column(name = "2_month")
    public String getToMonth() {
        return ToMonth;
    }

    public void setToMonth(String toMonth) {
        ToMonth = toMonth;
    }

    private String ToDay;

    @Basic
    @javax.persistence.Column(name = "2_day")
    public String getToDay() {
        return ToDay;
    }

    public void setToDay(String toDay) {
        ToDay = toDay;
    }

    private int d1YearSelectorId;

    @Basic
    @javax.persistence.Column(name = "d_1_year_selector_id")
    public int getD1YearSelectorId() {
        return d1YearSelectorId;
    }

    public void setD1YearSelectorId(int d1YearSelectorId) {
        this.d1YearSelectorId = d1YearSelectorId;
    }

    private int d1MonthSelectorId;

    @Basic
    @javax.persistence.Column(name = "d_1_month_selector_id")
    public int getD1MonthSelectorId() {
        return d1MonthSelectorId;
    }

    public void setD1MonthSelectorId(int d1MonthSelectorId) {
        this.d1MonthSelectorId = d1MonthSelectorId;
    }

    private int d1DaySelectorId;

    @Basic
    @javax.persistence.Column(name = "d_1_day_selector_id")
    public int getD1DaySelectorId() {
        return d1DaySelectorId;
    }

    public void setD1DaySelectorId(int d1DaySelectorId) {
        this.d1DaySelectorId = d1DaySelectorId;
    }

    private int d2YearSelectorId;

    @Basic
    @javax.persistence.Column(name = "d_2_year_selector_id")
    public int getD2YearSelectorId() {
        return d2YearSelectorId;
    }

    public void setD2YearSelectorId(int d2YearSelectorId) {
        this.d2YearSelectorId = d2YearSelectorId;
    }

    private int d2MonthSelectorId;

    @Basic
    @javax.persistence.Column(name = "d_2_month_selector_id")
    public int getD2MonthSelectorId() {
        return d2MonthSelectorId;
    }

    public void setD2MonthSelectorId(int d2MonthSelectorId) {
        this.d2MonthSelectorId = d2MonthSelectorId;
    }

    private int d2DaySelectorId;

    @Basic
    @javax.persistence.Column(name = "d_2_day_selector_id")
    public int getD2DaySelectorId() {
        return d2DaySelectorId;
    }

    public void setD2DaySelectorId(int d2DaySelectorId) {
        this.d2DaySelectorId = d2DaySelectorId;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private int addId;

    @Basic
    @javax.persistence.Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    private Date date1;

    @Basic
    @javax.persistence.Column(name = "date1")
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    private Date date2;

    @Basic
    @javax.persistence.Column(name = "date2")
    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaEntryDateEntity that = (IaaEntryDateEntity) o;

        if (id != that.id) return false;
        if (entryCommonId != that.entryCommonId) return false;
        if (dProvidedId != that.dProvidedId) return false;
        if (dDatePreSelectorId != that.dDatePreSelectorId) return false;
        if (d1YearSelectorId != that.d1YearSelectorId) return false;
        if (d1MonthSelectorId != that.d1MonthSelectorId) return false;
        if (d1DaySelectorId != that.d1DaySelectorId) return false;
        if (d2YearSelectorId != that.d2YearSelectorId) return false;
        if (d2MonthSelectorId != that.d2MonthSelectorId) return false;
        if (d2DaySelectorId != that.d2DaySelectorId) return false;
        if (addId != that.addId) return false;
        if (FromYear != null ? !FromYear.equals(that.FromYear) : that.FromYear != null) return false;
        if (FromMonth != null ? !FromMonth.equals(that.FromMonth) : that.FromMonth != null) return false;
        if (FromDay != null ? !FromDay.equals(that.FromDay) : that.FromDay != null) return false;
        if (ToYear != null ? !ToYear.equals(that.ToYear) : that.ToYear != null) return false;
        if (ToMonth != null ? !ToMonth.equals(that.ToMonth) : that.ToMonth != null) return false;
        if (ToDay != null ? !ToDay.equals(that.ToDay) : that.ToDay != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (date1 != null ? !date1.equals(that.date1) : that.date1 != null) return false;
        if (date2 != null ? !date2.equals(that.date2) : that.date2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + entryCommonId;
        result = 31 * result + dProvidedId;
        result = 31 * result + dDatePreSelectorId;
        result = 31 * result + (FromYear != null ? FromYear.hashCode() : 0);
        result = 31 * result + (FromMonth != null ? FromMonth.hashCode() : 0);
        result = 31 * result + (FromDay != null ? FromDay.hashCode() : 0);
        result = 31 * result + (ToYear != null ? ToYear.hashCode() : 0);
        result = 31 * result + (ToMonth != null ? ToMonth.hashCode() : 0);
        result = 31 * result + (ToDay != null ? ToDay.hashCode() : 0);
        result = 31 * result + d1YearSelectorId;
        result = 31 * result + d1MonthSelectorId;
        result = 31 * result + d1DaySelectorId;
        result = 31 * result + d2YearSelectorId;
        result = 31 * result + d2MonthSelectorId;
        result = 31 * result + d2DaySelectorId;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + addId;
        result = 31 * result + (date1 != null ? date1.hashCode() : 0);
        result = 31 * result + (date2 != null ? date2.hashCode() : 0);
        return result;
    }
}
