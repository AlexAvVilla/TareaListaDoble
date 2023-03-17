/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.ListaLopez;
import Modelos.ListaGarcia;
import Modelos.Pacientes;
import Vistas.frmLista;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

/**
 *
 * @author umg
 */
public class ListaController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmLista VistaListas;
    ListaGarcia ModeloGarcia;
    ListaLopez ModeloLopez;

    public ListaController(frmPrincipal VistaPrincipal, frmLista VistaListas, ListaGarcia ModeloGarcia, ListaLopez ModeloLopez) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaListas = VistaListas;
        this.ModeloGarcia = ModeloGarcia;
        this.ModeloLopez = ModeloLopez;
        
        this.VistaPrincipal.btnLopez.addActionListener(this);
        this.VistaPrincipal.btnGarcia.addActionListener(this);
        this.VistaPrincipal.btnPacientes.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnLopez)
        {
            this.ModeloLopez.EncolarPacienteLopez(this.VistaPrincipal.txtApellido.getText(),
                    this.VistaPrincipal.txtNombre.getText());
            
        }
        
        if(e.getSource()==this.VistaPrincipal.btnPacientes)
        {
            this.VistaListas.setVisible(true);
            //mostrar los datos en el text area
            Queue <Pacientes> ListaLocal = this.ModeloLopez.ListarPacienteLopez();
            
            String Cadena = "";
           for (Pacientes MiListaPacientes: ListaLocal)
               
               Cadena = Cadena + MiListaPacientes.getApellido()+" "+MiListaPacientes.getNombre()+"\n";
            this.VistaListas.txtLista.setText(Cadena);
        }
    }
    
    
    
}
