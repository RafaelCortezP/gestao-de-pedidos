package com.rafaelcortez.gestaodepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rafaelcortez.gestaodepedidos.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
