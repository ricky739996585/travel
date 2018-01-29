package com.ricky.travel.domain;

import java.io.Serializable;

public class ScenicVO  implements Serializable {
    private Integer scenicId;

    private Integer createId;

    private Integer cityId;

    private String scenicName;

    private String scenicPhone;

    private Integer scenicWant;

    private Integer scenicLike;

    private String scenicTag;

    private String scenicDescription;

    private String scenicCost;

    private String scenicAddress;

    private String scenicTime;

    private static final long serialVersionUID = 1L;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicPhone() {
        return scenicPhone;
    }

    public void setScenicPhone(String scenicPhone) {
        this.scenicPhone = scenicPhone == null ? null : scenicPhone.trim();
    }

    public Integer getScenicWant() {
        return scenicWant;
    }

    public void setScenicWant(Integer scenicWant) {
        this.scenicWant = scenicWant;
    }

    public Integer getScenicLike() {
        return scenicLike;
    }

    public void setScenicLike(Integer scenicLike) {
        this.scenicLike = scenicLike;
    }

    public String getScenicTag() {
        return scenicTag;
    }

    public void setScenicTag(String scenicTag) {
        this.scenicTag = scenicTag == null ? null : scenicTag.trim();
    }

    public String getScenicDescription() {
        return scenicDescription;
    }

    public void setScenicDescription(String scenicDescription) {
        this.scenicDescription = scenicDescription == null ? null : scenicDescription.trim();
    }

    public String getScenicCost() {
        return scenicCost;
    }

    public void setScenicCost(String scenicCost) {
        this.scenicCost = scenicCost == null ? null : scenicCost.trim();
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress == null ? null : scenicAddress.trim();
    }

    public String getScenicTime() {
        return scenicTime;
    }

    public void setScenicTime(String scenicTime) {
        this.scenicTime = scenicTime == null ? null : scenicTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicId=").append(scenicId);
        sb.append(", createId=").append(createId);
        sb.append(", cityId=").append(cityId);
        sb.append(", scenicName=").append(scenicName);
        sb.append(", scenicPhone=").append(scenicPhone);
        sb.append(", scenicWant=").append(scenicWant);
        sb.append(", scenicLike=").append(scenicLike);
        sb.append(", scenicTag=").append(scenicTag);
        sb.append(", scenicDescription=").append(scenicDescription);
        sb.append(", scenicCost=").append(scenicCost);
        sb.append(", scenicAddress=").append(scenicAddress);
        sb.append(", scenicTime=").append(scenicTime);
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
        ScenicVO other = (ScenicVO) that;
        return (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getScenicName() == null ? other.getScenicName() == null : this.getScenicName().equals(other.getScenicName()))
            && (this.getScenicPhone() == null ? other.getScenicPhone() == null : this.getScenicPhone().equals(other.getScenicPhone()))
            && (this.getScenicWant() == null ? other.getScenicWant() == null : this.getScenicWant().equals(other.getScenicWant()))
            && (this.getScenicLike() == null ? other.getScenicLike() == null : this.getScenicLike().equals(other.getScenicLike()))
            && (this.getScenicTag() == null ? other.getScenicTag() == null : this.getScenicTag().equals(other.getScenicTag()))
            && (this.getScenicDescription() == null ? other.getScenicDescription() == null : this.getScenicDescription().equals(other.getScenicDescription()))
            && (this.getScenicCost() == null ? other.getScenicCost() == null : this.getScenicCost().equals(other.getScenicCost()))
            && (this.getScenicAddress() == null ? other.getScenicAddress() == null : this.getScenicAddress().equals(other.getScenicAddress()))
            && (this.getScenicTime() == null ? other.getScenicTime() == null : this.getScenicTime().equals(other.getScenicTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getScenicName() == null) ? 0 : getScenicName().hashCode());
        result = prime * result + ((getScenicPhone() == null) ? 0 : getScenicPhone().hashCode());
        result = prime * result + ((getScenicWant() == null) ? 0 : getScenicWant().hashCode());
        result = prime * result + ((getScenicLike() == null) ? 0 : getScenicLike().hashCode());
        result = prime * result + ((getScenicTag() == null) ? 0 : getScenicTag().hashCode());
        result = prime * result + ((getScenicDescription() == null) ? 0 : getScenicDescription().hashCode());
        result = prime * result + ((getScenicCost() == null) ? 0 : getScenicCost().hashCode());
        result = prime * result + ((getScenicAddress() == null) ? 0 : getScenicAddress().hashCode());
        result = prime * result + ((getScenicTime() == null) ? 0 : getScenicTime().hashCode());
        return result;
    }
}