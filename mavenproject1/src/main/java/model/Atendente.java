/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raphael
 */
public class Atendente extends Pessoa {
    private String login;
    private String senha;

    public Atendente(String nome, String cpf, String endereco, String celular,
                      String login, String senha) {
        super(nome, cpf, endereco, celular);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() { return login; }

    public boolean autenticar(String loginDigitado, String senhaDigitada) {
        return this.login.equals(loginDigitado) && this.senha.equals(senhaDigitada);
    }
}
