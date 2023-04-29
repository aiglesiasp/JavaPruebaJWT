package com.aiglesiaspubill.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiaspubill.prueba.dto.Contacto;

public interface IContactoDAO extends JpaRepository<Contacto, Integer> {

}
