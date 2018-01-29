package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class ScenicLikeRecord implements Serializable {
    private Integer scenicRecordId;

    private Date scenicRecordDate;

    private String scenicRecordIp;

    private Integer scenicRecordUserId;

    private Integer scenicRecordScenicId;

    private static final long serialVersionUID = 1L;

    public Integer getScenicRecordId() {
        return scenicRecordId;
    }

    public void setScenicRecordId(Integer scenicRecordId) {
        this.scenicRecordId = scenicRecordId;
    }

    public Date getScenicRecordDate() {
        return scenicRecordDate;
    }

    public void setScenicRecordDate(Date scenicRecordDate) {
        this.scenicRecordDate = scenicRecordDate;
    }

    public String getScenicRecordIp() {
        return scenicRecordIp;
    }

    public void setScenicRecordIp(String scenicRecordIp) {
        this.scenicRecordIp = scenicRecordIp == null ? null : scenicRecordIp.trim();
    }

    public Integer getScenicRecordUserId() {
        return scenicRecordUserId;
    }

    public void setScenicRecordUserId(Integer scenicRecordUserId) {
        this.scenicRecordUserId = scenicRecordUserId;
    }

    public Integer getScenicRecordScenicId() {
        return scenicRecordScenicId;
    }

    public void setScenicRecordScenicId(Integer scenicRecordScenicId) {
        this.scenicRecordScenicId = scenicRecordScenicId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicRecordId=").append(scenicRecordId);
        sb.append(", scenicRecordDate=").append(scenicRecordDate);
        sb.append(", scenicRecordIp=").append(scenicRecordIp);
        sb.append(", scenicRecordUserId=").append(scenicRecordUserId);
        sb.append(", scenicRecordScenicId=").append(scenicRecordScenicId);
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
        ScenicLikeRecord other = (ScenicLikeRecord) that;
        return (this.getScenicRecordId() == null ? other.getScenicRecordId() == null : this.getScenicRecordId().equals(other.getScenicRecordId()))
            && (this.getScenicRecordDate() == null ? other.getScenicRecordDate() == null : this.getScenicRecordDate().equals(other.getScenicRecordDate()))
            && (this.getScenicRecordIp() == null ? other.getScenicRecordIp() == null : this.getScenicRecordIp().equals(other.getScenicRecordIp()))
            && (this.getScenicRecordUserId() == null ? other.getScenicRecordUserId() == null : this.getScenicRecordUserId().equals(other.getScenicRecordUserId()))
            && (this.getScenicRecordScenicId() == null ? other.getScenicRecordScenicId() == null : this.getScenicRecordScenicId().equals(other.getScenicRecordScenicId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScenicRecordId() == null) ? 0 : getScenicRecordId().hashCode());
        result = prime * result + ((getScenicRecordDate() == null) ? 0 : getScenicRecordDate().hashCode());
        result = prime * result + ((getScenicRecordIp() == null) ? 0 : getScenicRecordIp().hashCode());
        result = prime * result + ((getScenicRecordUserId() == null) ? 0 : getScenicRecordUserId().hashCode());
        result = prime * result + ((getScenicRecordScenicId() == null) ? 0 : getScenicRecordScenicId().hashCode());
        return result;
    }
}