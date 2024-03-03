package br.com.apiproject.apispring.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.apiproject.apispring.model.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer>{

    @SuppressWarnings("null")
    List<Pessoa>findAll();

    Pessoa findByCodigo(int codidigo);

}
