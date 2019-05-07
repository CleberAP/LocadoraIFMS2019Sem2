/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.mapeamento.pessoa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author KremerPereira
 */
// Para mapear as Super Classes
@MappedSuperclass
public abstract class Pessoa {
    
    @Id
    @GeneratedValue
    private long id;
    // limitando o tamanho do campo e deixando desabilitando NULO, ou seja, não poderá ser NULO
    @Column(length = 100, nullable = false )
    private String nome;
    
    @Column(nullable = false)
    private int idade;
    
    // Campo que poderá receber string tanto de CPF quanto de CNPJ e também não poderá ser NULO
    @Column(length = 15, nullable = false)
    private String cpfCNPJ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }
}
