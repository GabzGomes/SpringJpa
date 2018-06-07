package com.gabrielgomes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielgomes.cursomc.domain.Pedido;
import com.gabrielgomes.cursomc.repositories.PedidoRepository;
import com.gabrielgomes.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado: " + id + ", tipo: " + Pedido.class.getName()));
	}
}
