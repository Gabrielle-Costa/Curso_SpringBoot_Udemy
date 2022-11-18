package com.gabriellecosta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriellecosta.cursomc.domain.Categoria;
import com.gabriellecosta.cursomc.repositories.CategoriaRepository;
import com.gabriellecosta.cursomc.services.exeptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired //instancia automaticamente a dependência;
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	

}
