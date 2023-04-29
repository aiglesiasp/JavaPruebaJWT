package com.aiglesiaspubill.prueba.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aiglesiaspubill.prueba.dao.IUsuarioDAO;
import com.aiglesiaspubill.prueba.dto.Usuario;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private IUsuarioDAO iUsuarioDAO;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioDAO
				.findOneByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("El usuario con email "+email+ " no existe."));
		
		return new UserDetailsImpl(usuario);
	}

}
