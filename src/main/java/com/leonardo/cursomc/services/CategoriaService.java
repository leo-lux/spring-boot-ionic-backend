package com.leonardo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Categoria;
import com.leonardo.cursomc.repositories.CategoriaRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Object buscar(Integer id) {
		Object obj = repo.findById(id);
		return obj;
		
	}

}
