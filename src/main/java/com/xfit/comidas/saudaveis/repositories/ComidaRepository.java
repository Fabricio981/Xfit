package com.xfit.comidas.saudaveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xfit.comidas.saudaveis.models.Comida;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Integer>{
    
}
