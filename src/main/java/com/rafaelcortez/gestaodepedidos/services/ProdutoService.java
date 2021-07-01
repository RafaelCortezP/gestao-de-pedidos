package com.rafaelcortez.gestaodepedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelcortez.gestaodepedidos.domain.Produto;
import com.rafaelcortez.gestaodepedidos.repositories.CategoriaRepository;
import com.rafaelcortez.gestaodepedidos.repositories.ProdutoRepository;
import com.rafaelcortez.gestaodepedidos.services.exceptions.ObjectNotFoundException;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Produto find(Integer id){
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}

}
