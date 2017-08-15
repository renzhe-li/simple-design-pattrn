package com.rzli.design.pattrn.flyweight.dto;

import java.util.Date;

public class User {

	private long id;
	private String username;
	private String password;
	private Date createTime;
	private Date updateTime;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime == null ? null : (Date) createTime.clone();
	}

	public void setCreateTime(final Date createTime) {
		this.createTime = createTime == null ? null : (Date) createTime.clone();
	}

	public Date getUpdateTime() {
		return updateTime == null ? null : (Date) updateTime.clone();
	}

	public void setUpdateTime(final Date updateTime) {
		this.updateTime = updateTime == null ? null : (Date) updateTime.clone();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}
