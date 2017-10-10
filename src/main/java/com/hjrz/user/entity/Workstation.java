package com.hjrz.user.entity;

import java.util.Date;

public class Workstation {
    private Long worksCode;

    private String worksName;

    private Integer worksType;

    private String worksState;

    private Date create_time;

    private Workstatype worktype;
    
    private Workstation_info workstation_info;
    
    public Workstatype getWorkstatype() {
		return worktype;
	}

	public void setWorkstatype(Workstatype worktype) {
		this.worktype = worktype;
	}
	
	public Workstatype getWorktype() {
		return worktype;
	}

	public void setWorktype(Workstatype worktype) {
		this.worktype = worktype;
	}

	public Workstation_info getWorkstation_info() {
		return workstation_info;
	}

	public void setWorkstation_info(Workstation_info workstation_info) {
		this.workstation_info = workstation_info;
	}

	public Long getWorksCode() {
        return worksCode;
    }

    public void setWorksCode(Long worksCode) {
        this.worksCode = worksCode;
    }

    public String getWorksName() {
        return worksName;
    }

    public void setWorksName(String worksName) {
        this.worksName = worksName == null ? null : worksName.trim();
    }

    public Integer getWorksType() {
        return worksType;
    }

    public void setWorksType(Integer worksType) {
        this.worksType = worksType;
    }

    public String getWorksState() {
        return worksState;
    }

    public void setWorksState(String worksState) {
        this.worksState = worksState == null ? null : worksState.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        Workstation other = (Workstation) that;
        return (this.getWorksCode() == null ? other.getWorksCode() == null : this.getWorksCode().equals(other.getWorksCode()))
            && (this.getWorksName() == null ? other.getWorksName() == null : this.getWorksName().equals(other.getWorksName()))
            && (this.getWorksType() == null ? other.getWorksType() == null : this.getWorksType().equals(other.getWorksType()))
            && (this.getWorksState() == null ? other.getWorksState() == null : this.getWorksState().equals(other.getWorksState()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorksCode() == null) ? 0 : getWorksCode().hashCode());
        result = prime * result + ((getWorksName() == null) ? 0 : getWorksName().hashCode());
        result = prime * result + ((getWorksType() == null) ? 0 : getWorksType().hashCode());
        result = prime * result + ((getWorksState() == null) ? 0 : getWorksState().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}