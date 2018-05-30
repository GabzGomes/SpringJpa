package com.gabrielgomes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielgomes.cursomc.domain.Categoria;
import com.gabrielgomes.cursomc.repositories.CategoriaRepository;
import com.gabrielgomes.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado: " + id + ", tipo: " + Categoria.class.getName()));
	}

}
