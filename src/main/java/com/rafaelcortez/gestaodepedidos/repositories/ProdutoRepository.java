package com.rafaelcortez.gestaodepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelcortez.gestaodepedidos.domain.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
