package com.aiglesiaspubill.prueba.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiaspubill.prueba.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	Optional<Usuario> findOneByEmail(String email);

}
