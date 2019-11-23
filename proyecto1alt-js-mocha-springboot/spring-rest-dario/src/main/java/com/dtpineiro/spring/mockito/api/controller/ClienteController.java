package com.dtpineiro.spring.mockito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtpineiro.spring.mockito.api.dao.ClienteRepository;
import com.dtpineiro.spring.mockito.api.model.Cliente;
import com.dtpineiro.spring.mockito.api.model.Response;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping("/addCliente")
	public Response addEmployee(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return new Response(cliente + " inserted", Boolean.TRUE);
	}
	
	
	@GetMapping("/getClientes")
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
}
