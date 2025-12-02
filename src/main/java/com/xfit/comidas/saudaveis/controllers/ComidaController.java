package com.xfit.comidas.saudaveis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfit.comidas.saudaveis.models.Comida;
import com.xfit.comidas.saudaveis.services.ComidaService;

@RestController
@RequestMapping("/comida")
public class ComidaController {
    @Autowired
    public ComidaService comidaService;

    //count
    @GetMapping("/count")
    public Long count() {
        return comidaService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Comida find(@PathVariable Integer id) {
        return comidaService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Comida> list() {
        return comidaService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Comida salvar(@RequestBody Comida comida) {
        return comidaService.salvar(comida);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Comida save(@PathVariable Integer id, @RequestBody Comida comida){
        return comidaService.save(comida, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = comidaService.delete(id);
        if (deletou) {
            return "Comida indisponível com sucesso";
        }
        return "Falha ao indisponibilizar o comida";
    }
}
