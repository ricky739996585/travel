package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class DivideVO implements Serializable {
    private Integer divideId;

    private Integer adminId;

    private Integer authId;

    private Date divideDate;

    private static final long serialVersionUID = 1L;

    public Integer getDivideId() {
        return divideId;
    }

    public void setDivideId(Integer divideId) {
        this.divideId = divideId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Date getDivideDate() {
        return divideDate;
    }

    public void setDivideDate(Date divideDate) {
        this.divideDate = divideDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", divideId=").append(divideId);
        sb.append(", adminId=").append(adminId);
        sb.append(", authId=").append(authId);
        sb.append(", divideDate=").append(divideDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DivideVO other = (DivideVO) that;
        return (this.getDivideId() == null ? other.getDivideId() == null : this.getDivideId().equals(other.getDivideId()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getAuthId() == null ? other.getAuthId() == null : this.getAuthId().equals(other.getAuthId()))
            && (this.getDivideDate() == null ? other.getDivideDate() == null : this.getDivideDate().equals(other.getDivideDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDivideId() == null) ? 0 : getDivideId().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getAuthId() == null) ? 0 : getAuthId().hashCode());
        result = prime * result + ((getDivideDate() == null) ? 0 : getDivideDate().hashCode());
        return result;
    }
}