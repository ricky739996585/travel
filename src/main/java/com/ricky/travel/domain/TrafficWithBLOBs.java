package com.ricky.travel.domain;

import java.io.Serializable;

public class TrafficWithBLOBs extends Traffic implements Serializable {
    private String trafficContent;

    private String trafficCost;

    private static final long serialVersionUID = 1L;

    public String getTrafficContent() {
        return trafficContent;
    }

    public void setTrafficContent(String trafficContent) {
        this.trafficContent = trafficContent == null ? null : trafficContent.trim();
    }

    public String getTrafficCost() {
        return trafficCost;
    }

    public void setTrafficCost(String trafficCost) {
        this.trafficCost = trafficCost == null ? null : trafficCost.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trafficContent=").append(trafficContent);
        sb.append(", trafficCost=").append(trafficCost);
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
        TrafficWithBLOBs other = (TrafficWithBLOBs) that;
        return (this.getTrafficId() == null ? other.getTrafficId() == null : this.getTrafficId().equals(other.getTrafficId()))
            && (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()))
            && (this.getTrafficContent() == null ? other.getTrafficContent() == null : this.getTrafficContent().equals(other.getTrafficContent()))
            && (this.getTrafficCost() == null ? other.getTrafficCost() == null : this.getTrafficCost().equals(other.getTrafficCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrafficId() == null) ? 0 : getTrafficId().hashCode());
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        result = prime * result + ((getTrafficContent() == null) ? 0 : getTrafficContent().hashCode());
        result = prime * result + ((getTrafficCost() == null) ? 0 : getTrafficCost().hashCode());
        return result;
    }
}