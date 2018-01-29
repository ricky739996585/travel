package com.ricky.travel.domain;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer countryId;

    private String countryNname;

    private static final long serialVersionUID = 1L;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryNname() {
        return countryNname;
    }

    public void setCountryNname(String countryNname) {
        this.countryNname = countryNname == null ? null : countryNname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countryId=").append(countryId);
        sb.append(", countryNname=").append(countryNname);
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
        Country other = (Country) that;
        return (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountryNname() == null ? other.getCountryNname() == null : this.getCountryNname().equals(other.getCountryNname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountryNname() == null) ? 0 : getCountryNname().hashCode());
        return result;
    }
}