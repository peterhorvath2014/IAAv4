package com.iaa.domain.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Peter Horvath on 2015. 12. 25..
 */
@Entity
@Table(name = "iaa_user_iaa_right", schema = "iaa", catalog = "")
public class IaaUserIaaRightEntity implements Serializable {
    private int userId;
    private int dRightId;

    @Id
    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Basic
    @Column(name = "d_right_id")
    public int getdRightId() {
        return dRightId;
    }

    public void setdRightId(int dRightId) {
        this.dRightId = dRightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IaaUserIaaRightEntity that = (IaaUserIaaRightEntity) o;

        if (userId != that.userId) return false;
        if (dRightId != that.dRightId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + dRightId;
        return result;
    }
}
