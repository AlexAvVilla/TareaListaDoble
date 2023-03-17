/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaLopez {
   Queue<Pacientes> ListaLopez = new LinkedList();
    
    public void EncolarPacienteLopez(String apellido, String nombre){
        Pacientes nuevoPacientes = new Pacientes(apellido,nombre);
        this.ListaLopez.add(nuevoPacientes);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO:");
    }
    
    public Queue ListarPacienteLopez(){
        return this.ListaLopez;
    }
    
    public void DesEncolarLopez(){
        this.ListaLopez.poll();
    } 
}
