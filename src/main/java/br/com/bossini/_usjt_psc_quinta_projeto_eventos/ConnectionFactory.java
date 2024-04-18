/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rodrigo
 */
public class ConnectionFactory {
    String host = "pg-33ad0904-professorbossini.a.aivencloud.com";
    String port = "12956";
    String user = "avnadmin";
    String password = "AVNS_AYz38n0bB2kOyCL0TAF";
    String database = "defaultdb";
    
    //4 partes: tipo de retorno, nome, lista de parâmetros e corpo
    Connection conectar() throws Exception{
        //montar uma string de conexão
        //https://google.com:80/search?q=uva&condicao=chuvosa
        //jdbc:postgresql://host:port/database
        //java10+
        var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );
//        String nome = "Ana";
//        int idade = 20;
        //Meu nome é Ana e tenho 20 anos
        //concatenação
//        String solucao1 = "Meu nome é " + nome + " e tenho " + idade + " anos";
//        String solucao2 = String.format(
//            "Meu nome é %s e tenho %d anos, juro que tenho %d anos",
//            nome, idade, idade
//        );
    }
}
