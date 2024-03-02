package br.com.apiproject.apispring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiproject.apispring.model.Pessoa;

@RestController
public class Controller {
    
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
