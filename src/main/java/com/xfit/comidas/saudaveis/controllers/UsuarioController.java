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

import com.xfit.comidas.saudaveis.models.Usuario;
import com.xfit.comidas.saudaveis.services.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    public UsuarioService usuarioService;

    //count
    @GetMapping("/count")
    public Long count() {
        return usuarioService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Usuario find(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Usuario> list() {
        return usuarioService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Usuario save(@PathVariable Integer id, @RequestBody Usuario usuario){
        return usuarioService.save(usuario, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = usuarioService.delete(id);
        if (deletou) {
            return "Usuario indisponível com sucesso";
        }
        return "Falha ao indisponibilizar o usuario";
    }
}
