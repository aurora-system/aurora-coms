package com.spring.aurora.coms.entity;

import java.util.List;
import java.util.Set;

public class User {

	private long id;
	private String username;
	private String password;
	private boolean enabled;
	private Set<UserAuthority> authorities;
	private List<UserRole> roles;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Set<UserAuthority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Set<UserAuthority> authorities) {
		this.authorities = authorities;
	}
	public List<UserRole> getRoles() {
		return roles;
	}
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", username=").append(username).append(", password=")
				.append(password).append(", enabled=").append(enabled).append(", authorities=").append(authorities)
				.append(", roles=").append(roles).append("]");
		return builder.toString();
	}
	
}