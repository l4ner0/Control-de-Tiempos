/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controldetiempos;

import Controlador.ControladorUICT;
import Modelo.Conexion;
import Modelo.EmpleadoDAO;
import Vista.IUControlTiempos;
import Vista.Ventanas.VtnNuevoTrabajador;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControlDeTiempos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        
        IUControlTiempos controlTiempos = new IUControlTiempos();
        VtnNuevoTrabajador vtnNuevoTrabajador = new VtnNuevoTrabajador();
        ControladorUICT  control = new ControladorUICT(controlTiempos,
                vtnNuevoTrabajador);
        controlTiempos.setVisible(true);
    }
    
}
