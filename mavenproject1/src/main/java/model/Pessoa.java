/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raphael
 */
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String celular;
    
    public Pessoa(String nome, String cpf, String endereco, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
    }
    
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getCelular() { return celular; }
}

