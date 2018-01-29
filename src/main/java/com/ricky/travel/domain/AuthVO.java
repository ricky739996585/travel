package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class AuthVO implements Serializable {
    private Integer authId;

    private String authName;

    private Date authDate;

    private String authContent;

    private static final long serialVersionUID = 1L;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public String getAuthContent() {
        return authContent;
    }

    public void setAuthContent(String authContent) {
        this.authContent = authContent == null ? null : authContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authId=").append(authId);
        sb.append(", authName=").append(authName);
        sb.append(", authDate=").append(authDate);
        sb.append(", authContent=").append(authContent);
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
        AuthVO other = (AuthVO) that;
        return (this.getAuthId() == null ? other.getAuthId() == null : this.getAuthId().equals(other.getAuthId()))
            && (this.getAuthName() == null ? other.getAuthName() == null : this.getAuthName().equals(other.getAuthName()))
            && (this.getAuthDate() == null ? other.getAuthDate() == null : this.getAuthDate().equals(other.getAuthDate()))
            && (this.getAuthContent() == null ? other.getAuthContent() == null : this.getAuthContent().equals(other.getAuthContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthId() == null) ? 0 : getAuthId().hashCode());
        result = prime * result + ((getAuthName() == null) ? 0 : getAuthName().hashCode());
        result = prime * result + ((getAuthDate() == null) ? 0 : getAuthDate().hashCode());
        result = prime * result + ((getAuthContent() == null) ? 0 : getAuthContent().hashCode());
        return result;
    }
}