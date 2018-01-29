package com.ricky.travel.domain;

import java.io.Serializable;

public class CateVO implements Serializable {
    private Integer cateId;

    private Integer cityId;

    private String cateName;

    private String cateDescription;

    private String cateAddress;

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCateDescription() {
        return cateDescription;
    }

    public void setCateDescription(String cateDescription) {
        this.cateDescription = cateDescription == null ? null : cateDescription.trim();
    }

    public String getCateAddress() {
        return cateAddress;
    }

    public void setCateAddress(String cateAddress) {
        this.cateAddress = cateAddress == null ? null : cateAddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cateId=").append(cateId);
        sb.append(", cityId=").append(cityId);
        sb.append(", cateName=").append(cateName);
        sb.append(", cateDescription=").append(cateDescription);
        sb.append(", cateAddress=").append(cateAddress);
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
        CateVO other = (CateVO) that;
        return (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCateName() == null ? other.getCateName() == null : this.getCateName().equals(other.getCateName()))
            && (this.getCateDescription() == null ? other.getCateDescription() == null : this.getCateDescription().equals(other.getCateDescription()))
            && (this.getCateAddress() == null ? other.getCateAddress() == null : this.getCateAddress().equals(other.getCateAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCateName() == null) ? 0 : getCateName().hashCode());
        result = prime * result + ((getCateDescription() == null) ? 0 : getCateDescription().hashCode());
        result = prime * result + ((getCateAddress() == null) ? 0 : getCateAddress().hashCode());
        return result;
    }
}