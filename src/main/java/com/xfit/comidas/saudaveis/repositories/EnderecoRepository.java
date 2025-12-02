package com.xfit.comidas.saudaveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xfit.comidas.saudaveis.models.Endereco;

@Repository
public interface  EnderecoRepository extends JpaRepository<Endereco, Integer>{
    
}
