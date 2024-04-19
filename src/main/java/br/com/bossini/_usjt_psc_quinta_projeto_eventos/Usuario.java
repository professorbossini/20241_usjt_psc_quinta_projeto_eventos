/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos;

/**
 *
 * @author rodrigo
 */
public class Usuario {
    int codigo;
    String login;
    String senha;
    
    //construtor padrão
    Usuario(){}
    
    Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
}
