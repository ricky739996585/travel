package com.ricky.travel.domain;

import java.io.Serializable;

public class ScenicWithBLOBs extends Scenic implements Serializable {
    private String scenicDescription;

    private String scenicCost;

    private String scenicAddress;

    private String scenicTime;

    private static final long serialVersionUID = 1L;

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
        ScenicWithBLOBs other = (ScenicWithBLOBs) that;
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