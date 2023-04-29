/**
 * 
 */
package com.aiglesiaspubill.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiaspubill.prueba.dao.IContactoDAO;
import com.aiglesiaspubill.prueba.dto.Contacto;

/**
 * @author aitor
 *
 */
@Service
public class ContactoServiceImpl implements IContactoService {

	@Autowired
	IContactoDAO iContactoDAO;

	@Override
	public List<Contacto> listarContacto() {
		return iContactoDAO.findAll();
	}

	@Override
	public Contacto guardarContacto(Contacto contacto) {
		return iContactoDAO.save(contacto);
	}

	@Override
	public Contacto contactoById(int codigo) {
		return iContactoDAO.findById(codigo).get();
	}

	@Override
	public Contacto actualizarContacto(Contacto contacto) {
		return iContactoDAO.save(contacto);
	}

	@Override
	public void eliminarContacto(int codigo) {
		iContactoDAO.deleteById(codigo);

	}

}
