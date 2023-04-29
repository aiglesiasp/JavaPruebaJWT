package com.aiglesiaspubill.prueba.security;

import static com.aiglesiaspubill.prueba.security.Constants.HEADER_AUTHORIZACION_KEY;
import static com.aiglesiaspubill.prueba.security.Constants.TOKEN_BEARER_PREFIX;
import java.io.IOException;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		String header = req.getHeader(HEADER_AUTHORIZACION_KEY);
		if (header != null && !header.startsWith(TOKEN_BEARER_PREFIX)) {
			String token = header.replace(TOKEN_BEARER_PREFIX, "");
			UsernamePasswordAuthenticationToken authentication = TokenUtils.getAuthentication(token);
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}

		chain.doFilter(req, res);
	}

}
