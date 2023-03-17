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
public class ListaGarcia {
    Queue<Pacientes> ListaGarcia = new LinkedList();
    
    public void EncolarPacienteGarcia(String apellido, String nombre){
        Pacientes nuevoPacientes = new Pacientes(apellido,nombre);
        this.ListaGarcia.add(nuevoPacientes);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO:");
    }
    
    public Queue ListarPacienteGarcia(){
        return this.ListaGarcia;
    }
    
    public void DesEncolarGarcia(){
        this.ListaGarcia.poll();
    }
    
}
