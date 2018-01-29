package com.ricky.travel.domain;

import java.io.Serializable;

public class Traffic implements Serializable {
    private Integer trafficId;

    private Integer scenicId;

    private static final long serialVersionUID = 1L;

    public Integer getTrafficId() {
        return trafficId;
    }

    public void setTrafficId(Integer trafficId) {
        this.trafficId = trafficId;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trafficId=").append(trafficId);
        sb.append(", scenicId=").append(scenicId);
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
        Traffic other = (Traffic) that;
        return (this.getTrafficId() == null ? other.getTrafficId() == null : this.getTrafficId().equals(other.getTrafficId()))
            && (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrafficId() == null) ? 0 : getTrafficId().hashCode());
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        return result;
    }
}