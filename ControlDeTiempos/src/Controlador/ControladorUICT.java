/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.*;
import Vista.IUControlTiempos;
import Vista.Ventanas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorUICT implements ActionListener{
    
    IUControlTiempos iuControlTiempos = new IUControlTiempos();
    variableStatica ventana = new variableStatica();
    
    public ControladorUICT(IUControlTiempos iuControlTiempos,
            VtnNuevoTrabajador vtnNuevoTrabajador){
        this.iuControlTiempos=iuControlTiempos;
        this.iuControlTiempos.btnNuevoTrabajador.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==iuControlTiempos.btnNuevoTrabajador)
        {
            VtnNuevoTrabajador nuevoTrabajador = new VtnNuevoTrabajador();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            ControladorNT controladorNT = new ControladorNT(nuevoTrabajador,empleadoDAO);
            
            if(ventana.ventanaNuevoTrabajador==false)
            {   
                nuevoTrabajador.setVisible(true);
                
                ventana.ventanaNuevoTrabajador=true;
            }
            
            
                
        }
    }
}
