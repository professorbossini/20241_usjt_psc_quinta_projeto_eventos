/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos.exemplos;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodrigo
 */
public class ExemploJTable2 {
    public static void main(String[] args) {
       Object [][] dados = {
           {"Ana", 18, "F", "Rua A", true},
           {"João", 22, "M", "Rua B", false}           
       };
       String [] colunas = {"Nome", "Idade", "Sexo", "Endereço", "Veg"};
       
       var modelo = new ExibicaoPersonalizadaTableModel(colunas, dados);
       var tabela = new JTable(modelo);
       var tela = new JFrame ("Exemplo 2");
       var scrollPane = new JScrollPane(tabela);
       tela.getContentPane().add(scrollPane);
       tela.setVisible(true);
       tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       tela.pack();
       
    }
}

class ExibicaoPersonalizadaTableModel extends AbstractTableModel{

    private String [] colunas;
    private Object[][] dados;
    
    ExibicaoPersonalizadaTableModel(String [] colunas, Object[][] dados){
        this.colunas = colunas;
        this.dados = dados;
    }
    
    @Override
    public int getRowCount() {
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    
    
}

