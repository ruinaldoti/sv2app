package com.sv2app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sv2app.domain.Cliente;
import com.sv2app.repositories.ClienteRepository;
import com.sv2app.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encobtrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}
	
	
}
