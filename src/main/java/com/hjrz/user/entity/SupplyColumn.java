package com.hjrz.user.entity;

import java.util.Date;

public class SupplyColumn {
    private Integer supplyCode;

    private String supplyHead;

    private String supplyBrand;

    private Date create_time;

    private String supplyAliveState;

    private String create_admin;

    private String supplyurl;

    private String supplydep;

    public Integer getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(Integer supplyCode) {
        this.supplyCode = supplyCode;
    }

    public String getSupplyHead() {
        return supplyHead;
    }

    public void setSupplyHead(String supplyHead) {
        this.supplyHead = supplyHead == null ? null : supplyHead.trim();
    }

    public String getSupplyBrand() {
        return supplyBrand;
    }

    public void setSupplyBrand(String supplyBrand) {
        this.supplyBrand = supplyBrand == null ? null : supplyBrand.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getSupplyAliveState() {
        return supplyAliveState;
    }

    public void setSupplyAliveState(String supplyAliveState) {
        this.supplyAliveState = supplyAliveState == null ? null : supplyAliveState.trim();
    }

    public String getCreate_admin() {
        return create_admin;
    }

    public void setCreate_admin(String create_admin) {
        this.create_admin = create_admin == null ? null : create_admin.trim();
    }

    public String getSupplyurl() {
        return supplyurl;
    }

    public void setSupplyurl(String supplyurl) {
        this.supplyurl = supplyurl == null ? null : supplyurl.trim();
    }

    public String getSupplydep() {
        return supplydep;
    }

    public void setSupplydep(String supplydep) {
        this.supplydep = supplydep == null ? null : supplydep.trim();
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
        SupplyColumn other = (SupplyColumn) that;
        return (this.getSupplyCode() == null ? other.getSupplyCode() == null : this.getSupplyCode().equals(other.getSupplyCode()))
            && (this.getSupplyHead() == null ? other.getSupplyHead() == null : this.getSupplyHead().equals(other.getSupplyHead()))
            && (this.getSupplyBrand() == null ? other.getSupplyBrand() == null : this.getSupplyBrand().equals(other.getSupplyBrand()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getSupplyAliveState() == null ? other.getSupplyAliveState() == null : this.getSupplyAliveState().equals(other.getSupplyAliveState()))
            && (this.getCreate_admin() == null ? other.getCreate_admin() == null : this.getCreate_admin().equals(other.getCreate_admin()))
            && (this.getSupplyurl() == null ? other.getSupplyurl() == null : this.getSupplyurl().equals(other.getSupplyurl()))
            && (this.getSupplydep() == null ? other.getSupplydep() == null : this.getSupplydep().equals(other.getSupplydep()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSupplyCode() == null) ? 0 : getSupplyCode().hashCode());
        result = prime * result + ((getSupplyHead() == null) ? 0 : getSupplyHead().hashCode());
        result = prime * result + ((getSupplyBrand() == null) ? 0 : getSupplyBrand().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getSupplyAliveState() == null) ? 0 : getSupplyAliveState().hashCode());
        result = prime * result + ((getCreate_admin() == null) ? 0 : getCreate_admin().hashCode());
        result = prime * result + ((getSupplyurl() == null) ? 0 : getSupplyurl().hashCode());
        result = prime * result + ((getSupplydep() == null) ? 0 : getSupplydep().hashCode());
        return result;
    }
}