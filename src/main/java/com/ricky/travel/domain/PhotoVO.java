package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class PhotoVO implements Serializable {
    private Integer scenicPhotoId;

    private Integer scenicId;

    private Date scenicPhotoDate;

    private String scenicPhotoUrl;

    private static final long serialVersionUID = 1L;

    public Integer getScenicPhotoId() {
        return scenicPhotoId;
    }

    public void setScenicPhotoId(Integer scenicPhotoId) {
        this.scenicPhotoId = scenicPhotoId;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Date getScenicPhotoDate() {
        return scenicPhotoDate;
    }

    public void setScenicPhotoDate(Date scenicPhotoDate) {
        this.scenicPhotoDate = scenicPhotoDate;
    }

    public String getScenicPhotoUrl() {
        return scenicPhotoUrl;
    }

    public void setScenicPhotoUrl(String scenicPhotoUrl) {
        this.scenicPhotoUrl = scenicPhotoUrl == null ? null : scenicPhotoUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicPhotoId=").append(scenicPhotoId);
        sb.append(", scenicId=").append(scenicId);
        sb.append(", scenicPhotoDate=").append(scenicPhotoDate);
        sb.append(", scenicPhotoUrl=").append(scenicPhotoUrl);
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
        PhotoVO other = (PhotoVO) that;
        return (this.getScenicPhotoId() == null ? other.getScenicPhotoId() == null : this.getScenicPhotoId().equals(other.getScenicPhotoId()))
            && (this.getScenicId() == null ? other.getScenicId() == null : this.getScenicId().equals(other.getScenicId()))
            && (this.getScenicPhotoDate() == null ? other.getScenicPhotoDate() == null : this.getScenicPhotoDate().equals(other.getScenicPhotoDate()))
            && (this.getScenicPhotoUrl() == null ? other.getScenicPhotoUrl() == null : this.getScenicPhotoUrl().equals(other.getScenicPhotoUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScenicPhotoId() == null) ? 0 : getScenicPhotoId().hashCode());
        result = prime * result + ((getScenicId() == null) ? 0 : getScenicId().hashCode());
        result = prime * result + ((getScenicPhotoDate() == null) ? 0 : getScenicPhotoDate().hashCode());
        result = prime * result + ((getScenicPhotoUrl() == null) ? 0 : getScenicPhotoUrl().hashCode());
        return result;
    }
}