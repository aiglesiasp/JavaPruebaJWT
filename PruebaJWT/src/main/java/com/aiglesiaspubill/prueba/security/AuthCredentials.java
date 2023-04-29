package com.aiglesiaspubill.prueba.security;

import lombok.Data;

@Data
public class AuthCredentials {

	private String email;
	private String password;

	public AuthCredentials( ) {
		this.email = "";
		this.password = "";
	}
	public AuthCredentials(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthCredentials [email=" + email + ", password=" + password + "]";
	}

}
