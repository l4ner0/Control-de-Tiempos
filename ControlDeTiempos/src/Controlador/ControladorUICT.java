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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorUICT implements ActionListener{
    
    IUControlTiempos iuControlTiempos = new IUControlTiempos();
    variableStatica ventana = new variableStatica();
    VtnControl vntControl = new VtnControl();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    public final static int PORT=5000;
    public ControladorUICT(IUControlTiempos iuControlTiempos){
        this.iuControlTiempos=iuControlTiempos;
        
        this.iuControlTiempos.btnInicio.addActionListener(this);
        this.iuControlTiempos.btnNuevoTrabajador.addActionListener(this);
        this.iuControlTiempos.btnListar.addActionListener(this);
        this.iuControlTiempos.btnControl.addActionListener(this);
        this.iuControlTiempos.btnReporte.addActionListener(this);
        ControladorServicios servidor = new ControladorServicios(vntControl,empleadoDAO);
        Thread server = new Thread(servidor);   
        server.start();
        
    }
 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==iuControlTiempos.btnInicio)
        {
            JOptionPane.showMessageDialog(null,"Le distes a Inicio :-)");
        }
        
        if(e.getSource()==iuControlTiempos.btnNuevoTrabajador)
        {
            VtnNuevoTrabajador nuevoTrabajador = new VtnNuevoTrabajador();
            
            ControladorNT controladorNT = new ControladorNT(nuevoTrabajador,empleadoDAO);
            
            if(ventana.ventanaNuevoTrabajador==false)
            {   
                nuevoTrabajador.setVisible(true);
                
                ventana.ventanaNuevoTrabajador=true;
            } 
        }
        
        if(e.getSource()==iuControlTiempos.btnControl)
        {
            VtnControl vntControl = new VtnControl();

        }
        
        if(e.getSource()==iuControlTiempos.btnListar)
        {
            JOptionPane.showMessageDialog(null,"Le distes a Listar :-)");
        }
        
        if(e.getSource()==iuControlTiempos.btnReporte)
        {
            JOptionPane.showMessageDialog(null,"Le distes a Reporte de asistencias :-)");
        }
        
    }
    

}
