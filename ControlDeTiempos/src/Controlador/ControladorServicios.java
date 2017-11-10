/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import static Controlador.ControladorUICT.PORT;
import Vista.IUControlTiempos;
import Vista.Ventanas.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import Vista.Ventanas.*;

/**
 *
 * @author diego
 */
public class ControladorServicios implements Runnable{
    pnlControl pnlcontrol;
    Prueba p;
    public ControladorServicios(pnlControl pnlcontrol, Prueba p){
        this.pnlcontrol=pnlcontrol;
        this.p=p;
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
                   JOptionPane.showMessageDialog(null,request);
                   p.setVisible(true);
                   p.lblTexto.setText(request);
                   p.txtTexto.setText(request);
                   pnlcontrol.txtNomApControl.setText(request);
                   
                   
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
