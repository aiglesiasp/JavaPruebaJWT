/**
 * 
 */
package com.aiglesiaspubill.prueba.service;

import java.util.List;

import com.aiglesiaspubill.prueba.dto.Contacto;

/**
 * @author aitor
 *
 */
public interface IContactoService {
	// Metodos del CRUD
	public List<Contacto> listarContacto();

	public Contacto guardarContacto(Contacto contacto);

	public Contacto contactoById(int codigo);

	public Contacto actualizarContacto(Contacto contacto);

	public void eliminarContacto(int codigo);
}
