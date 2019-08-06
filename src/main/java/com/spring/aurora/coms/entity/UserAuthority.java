package com.spring.aurora.coms.entity;

public class UserAuthority {

	private long id;
	private User user;
	private String authority;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserAuthority [id=").append(id).append(", user=").append(user).append(", authority=")
				.append(authority).append("]");
		return builder.toString();
	}
	
}