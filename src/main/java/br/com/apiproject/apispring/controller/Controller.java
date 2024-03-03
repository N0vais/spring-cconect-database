package br.com.apiproject.apispring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiproject.apispring.model.Pessoa;
import br.com.apiproject.apispring.repositorio.Repositorio;

@RestController
public class Controller {
    
    @Autowired
    private Repositorio acao;

    @SuppressWarnings("null")
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @GetMapping("")
    public String mensagen(){
        return "ola daniel";
    }

    @GetMapping("/client/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo!" + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }

}

