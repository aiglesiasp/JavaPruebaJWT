package com.aiglesiaspubill.prueba.security;

public class Constants {
	// Spring Security

//	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT
	public static final String ACCESS_TOKEN_SECRET = "4qhq8LrEBfYcaRHxhdb9zURb2rf8e7Ud";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000L; // 10 day
	
//	public static final String ISSUER_INFO = "Aitor Iglesias";
//	public static final String SUPER_SECRET_KEY = "1234";
}
