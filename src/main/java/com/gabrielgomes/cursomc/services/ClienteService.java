package com.gabrielgomes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielgomes.cursomc.domain.Cliente;
import com.gabrielgomes.cursomc.repositories.ClienteRepository;
import com.gabrielgomes.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado: " + id + ", tipo: " + Cliente.class.getName()));
	}

}
