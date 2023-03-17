
import Controlador.ListaController;
import Modelos.ListaGarcia;
import Modelos.ListaLopez;
import Vistas.frmLista;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLista VistaLista = new frmLista(VistaPrincipal, true);
        ListaLopez ModeloLopez = new ListaLopez();
        ListaGarcia ModeloGarcia = new ListaGarcia();
        ListaController ControladorLista = new ListaController(VistaPrincipal, VistaLista, ModeloGarcia, ModeloLopez);
        
        
    }
    
}
