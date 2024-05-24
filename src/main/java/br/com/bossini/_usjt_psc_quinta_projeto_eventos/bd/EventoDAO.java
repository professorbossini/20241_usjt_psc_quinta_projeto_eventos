/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos.bd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public class EventoDAO {

    List<Evento> listar() throws Exception {
        //construir uma lista
        var eventos = new ArrayList<Evento>();
        //1. Especificar o comando SQL
        var sql = "SELECT * FROM tb_evento_psc_quinta";
        //2. Estabelecer uma conexão com O SGBD
        //try-with-resources
        try (
                var conexao = new ConnectionFactory().conectar(); //3. Preparar o comando
                 var ps = conexao.prepareStatement(sql); //4. Substituir os eventos placeholders
                //5. Executar o comando
                 var rs = ps.executeQuery();) {
            while (rs.next()) {
                //6. Lidar com o resultado
                var codigo = rs.getInt("cod_evento");
                var nome = rs.getString("nome");
                var descricao = rs.getString("descricao");
                java.util.Date dataInicio = rs.getDate("data_inicio");
                java.util.Date dataFim = rs.getDate("data_fim");
                var evento = new Evento();
                evento.setCodigo(codigo);
                evento.setNome(nome);
                evento.setDescricao(descricao);
                evento.setDataInicio(dataInicio);
                evento.setDataFim(dataFim);
                eventos.add(evento);
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources
            //8. Devolvo a coleção construída
            return eventos;
        }
    }
    public static void main(String[] args) throws Exception{
        var eventoDAO = new EventoDAO();
        var eventos = eventoDAO.listar();
        for (Evento e : eventos){
            System.out.println(e);
                    
        }
    }
}
