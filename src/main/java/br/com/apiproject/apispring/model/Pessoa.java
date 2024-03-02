package br.com.apiproject.apispring.model;

public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;

    //criando os Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
