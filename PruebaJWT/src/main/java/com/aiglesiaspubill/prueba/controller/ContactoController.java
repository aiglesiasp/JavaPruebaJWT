/**
 * 
 */
package com.aiglesiaspubill.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiaspubill.prueba.dto.Contacto;
import com.aiglesiaspubill.prueba.service.ContactoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/contactos")
public class ContactoController {

	@Autowired
	ContactoServiceImpl contactoServiceImpl;

	@GetMapping
	public List<Contacto> listarContacto() {
		return contactoServiceImpl.listarContacto();
	}

//	@PostMapping("/save")
//	public Contacto guardarContacto(@RequestBody Contacto contacto) {
//		return contactoServiceImpl.guardarContacto(contacto);
//	}
//
//	@GetMapping("/byId/{id}")
//	public Contacto contactoById(@PathVariable(name = "id") int id) {
//		Contacto contacto = new Contacto();
//		contacto = contactoServiceImpl.contactoById(id);
//		return contacto;
//	}
//
//	@PutMapping("/update/{id}")
//	public Contacto actualizarContacto(@PathVariable(name = "id") int id, @RequestBody Contacto contacto) {
//
//		Contacto contacto_seleccionado = new Contacto();
//		Contacto contacto_actualizado = new Contacto();
//		contacto_seleccionado = contactoServiceImpl.contactoById(id);
//		contacto_seleccionado.setId(id);
//		contacto_seleccionado.setCelular(contacto.getCelular());
//		contacto_seleccionado.setEmail(contacto.getEmail());
//		contacto_seleccionado.setNombre(contacto.getNombre());
//
//		contacto_actualizado = contactoServiceImpl.actualizarContacto(contacto_seleccionado);
//
//		return contacto_actualizado;
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public void eliminarContacto(@PathVariable(name = "id") int id) {
//		contactoServiceImpl.eliminarContacto(id);
//	}

}
