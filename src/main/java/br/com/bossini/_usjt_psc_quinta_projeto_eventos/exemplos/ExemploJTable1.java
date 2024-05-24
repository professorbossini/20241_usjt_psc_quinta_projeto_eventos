/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos.exemplos;

/**
 *
 * @author rodrigo
 */
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
public class ExemploJTable1 {
    public static void main(String[] args) {
        //nomes das colunas
        String [] colunas = {"Nome", "Idade", "Sexo", "Endereço", "Veg"};
        
        //dados
        Object [][] dados = {
            {"Ana", 18, "F", "Rua A", true},
            {"Pedro", 19, "M", "Rua B", false}
        };
        
        var tabela = new JTable(dados, colunas);
        var tela = new JFrame("Exemplo tabela");
        var scrollPane = new JScrollPane(tabela);
        tela.getContentPane().add(scrollPane);
        tela.pack();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}


