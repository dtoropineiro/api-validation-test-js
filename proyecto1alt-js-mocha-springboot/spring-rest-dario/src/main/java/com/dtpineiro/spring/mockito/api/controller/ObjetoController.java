package com.dtpineiro.spring.mockito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtpineiro.spring.mockito.api.dao.ObjetoRepository;
import com.dtpineiro.spring.mockito.api.model.Objeto;
import com.dtpineiro.spring.mockito.api.model.Response;

@RestController
@RequestMapping("/objeto")
public class ObjetoController {
	
	@Autowired
	private ObjetoRepository objetoRepository;
	
	@PostMapping("/addObjeto")
	public Response addObjeto(@RequestBody Objeto objeto) {
		objetoRepository.save(objeto);
		return new Response(objeto + " inserted", Boolean.TRUE);
	}
	
	
	@GetMapping("/getObjetos")
	public List<Objeto> getAllObjetos() {
		return objetoRepository.findAll();
	}
	

}
