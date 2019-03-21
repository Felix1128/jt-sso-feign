package com.jt.pojo;

import java.io.Serializable;
import java.util.Date;

public class BasePojo implements Serializable{

	private static final long serialVersionUID = 599612877887400916L;
	private Date created;
	private Date updated;
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
