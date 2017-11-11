/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import static Controlador.ControladorUICT.PORT;
import Modelo.EmpleadoDAO;
import Vista.IUControlTiempos;
import Vista.Ventanas.*;
import Vista.Ventanas.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorServicios implements Runnable{
    VtnControl vtnControl;
    EmpleadoDAO empleadoDAO;
    variableStatica ventana = new variableStatica();
    public ControladorServicios(VtnControl vtnControl, EmpleadoDAO empleadoDAO){
        this.vtnControl=vtnControl;
        this.empleadoDAO=empleadoDAO;
    }
    
    @Override
    public void run(){
        try
        {
           ServerSocket serverSocket=new ServerSocket(PORT); 
           System.out.println("Servidor> Servidor iniciado");
           System.out.println("Servidor> En espera del cliente...");

           Socket clientSocket;
           
           while(true)
           {
             clientSocket=  serverSocket.accept();
             
             BufferedReader input= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

             
             String request=input.readLine();
               if(request!=null)
               {    
                   
                   System.out.println("Cliente> petición [ "+request+" ]");
                   ArrayList datosEmpleado=empleadoDAO.BuscarEmpleado(request);
                   if(datosEmpleado!=null){
                       if(ventana.ventanaControlAsistencia==false)
                    {   
                        vtnControl.setVisible(true);
                
                        ventana.ventanaControlAsistencia=true;
                    }
                       JOptionPane.showMessageDialog(null,request);
                       String ApellidoP=String.valueOf(datosEmpleado.get(3));
                       String ApellidoM=String.valueOf(datosEmpleado.get(4));
                       String Nombres=String.valueOf(datosEmpleado.get(2));
                       vtnControl.txtTexto.setText(ApellidoP+" "+ApellidoM+" "+Nombres);
                   }else{
                       JOptionPane.showMessageDialog(null,"El empleado no existe");
                       vtnControl.txtTexto.setText("");
                   } 
               }
               
               request=null;
               
             clientSocket.close();
             
           }
        }
        catch(IOException ex )
        {
           System.err.println(ex.getMessage()); 
        }
    }
}
