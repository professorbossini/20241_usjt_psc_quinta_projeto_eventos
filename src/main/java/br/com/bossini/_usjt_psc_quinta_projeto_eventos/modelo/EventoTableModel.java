/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos.modelo;

/**
 *
 * @author rodrigo
 */
import br.com.bossini._usjt_psc_quinta_projeto_eventos.bd.Evento;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class EventoTableModel extends AbstractTableModel{
    private List<Evento> eventos;
    public EventoTableModel(List<Evento> eventos){
        this.eventos = eventos;
    }

    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Evento e = eventos.get(rowIndex);
        if (columnIndex == 0)
            return e.getCodigo();
        
    }
    
}

//abstract class Animal{
//    private String nome;
//    public abstract void falar();
//}
//
//class Gato extends Animal{
//    public void falar(){
//        System.out.println("miau");
//    }
//}
//
//Gato g = new Gato();
//g.falar();


