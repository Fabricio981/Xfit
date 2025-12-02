package com.xfit.comidas.saudaveis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xfit.comidas.saudaveis.models.Comida;
import com.xfit.comidas.saudaveis.repositories.ComidaRepository;


@Service
public class ComidaService {
    @Autowired
    public ComidaRepository comidaRepository;

    //count
    public Long count() {
        return comidaRepository.count();
    }

    //findById
    public Comida findById(Integer id) {
        return comidaRepository.findById(id).get();
    }

    //findAll
    public List<Comida> listar(){
            return comidaRepository.findAll();
    }

    //save
    public Comida salvar(Comida comida) {
        return comidaRepository.save(comida);
    }  

    //update
    public Comida save(Comida comida, Integer id) {
        Comida e = findById(id);
        if (e != null) {
            comida.setId(id);
            return comidaRepository.save(comida);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Comida comida = comidaRepository.findById(id).get();
        if(comida != null) {
            comidaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
