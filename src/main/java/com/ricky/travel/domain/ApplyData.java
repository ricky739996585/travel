package com.ricky.travel.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplyData implements Serializable {
    private Integer dataId;

    private Integer applyId;

    private String dataName;

    private String dataOrganize;

    private Date dataStartdate;

    private Date dataEnddate;

    private String dataUrl;

    private static final long serialVersionUID = 1L;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public String getDataOrganize() {
        return dataOrganize;
    }

    public void setDataOrganize(String dataOrganize) {
        this.dataOrganize = dataOrganize == null ? null : dataOrganize.trim();
    }

    public Date getDataStartdate() {
        return dataStartdate;
    }

    public void setDataStartdate(Date dataStartdate) {
        this.dataStartdate = dataStartdate;
    }

    public Date getDataEnddate() {
        return dataEnddate;
    }

    public void setDataEnddate(Date dataEnddate) {
        this.dataEnddate = dataEnddate;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl == null ? null : dataUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataId=").append(dataId);
        sb.append(", applyId=").append(applyId);
        sb.append(", dataName=").append(dataName);
        sb.append(", dataOrganize=").append(dataOrganize);
        sb.append(", dataStartdate=").append(dataStartdate);
        sb.append(", dataEnddate=").append(dataEnddate);
        sb.append(", dataUrl=").append(dataUrl);
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
        ApplyData other = (ApplyData) that;
        return (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getDataName() == null ? other.getDataName() == null : this.getDataName().equals(other.getDataName()))
            && (this.getDataOrganize() == null ? other.getDataOrganize() == null : this.getDataOrganize().equals(other.getDataOrganize()))
            && (this.getDataStartdate() == null ? other.getDataStartdate() == null : this.getDataStartdate().equals(other.getDataStartdate()))
            && (this.getDataEnddate() == null ? other.getDataEnddate() == null : this.getDataEnddate().equals(other.getDataEnddate()))
            && (this.getDataUrl() == null ? other.getDataUrl() == null : this.getDataUrl().equals(other.getDataUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getDataName() == null) ? 0 : getDataName().hashCode());
        result = prime * result + ((getDataOrganize() == null) ? 0 : getDataOrganize().hashCode());
        result = prime * result + ((getDataStartdate() == null) ? 0 : getDataStartdate().hashCode());
        result = prime * result + ((getDataEnddate() == null) ? 0 : getDataEnddate().hashCode());
        result = prime * result + ((getDataUrl() == null) ? 0 : getDataUrl().hashCode());
        return result;
    }
}