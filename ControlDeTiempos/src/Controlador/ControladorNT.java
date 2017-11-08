/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.EmpleadoDAO;
import Vista.Ventanas.IdentifAcceso;
import Vista.Ventanas.VtnNuevoTrabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorNT implements ActionListener {
    
    VtnNuevoTrabajador vtnNuevoTrabajador = new VtnNuevoTrabajador();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    String opcionSexo;
    
    public ControladorNT(VtnNuevoTrabajador vtnNuevoTrabajador, 
            EmpleadoDAO empleadoDAO){
        
        this.vtnNuevoTrabajador=vtnNuevoTrabajador;
        this.empleadoDAO = empleadoDAO;
        this.vtnNuevoTrabajador.btnGrabar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        
        if(e.getSource()==vtnNuevoTrabajador.btnGrabar)
        {
            if(vtnNuevoTrabajador.rbtnHombre.isSelected())
            {
                  opcionSexo="Masculino";
            }else
            {
                  opcionSexo="Femenino";
            }
            String idEmpleado=generarCodigo();
            String nombres=vtnNuevoTrabajador.txtNom.getText();
            String apellidoPaterno=vtnNuevoTrabajador.txtApPa.getText();
            String apellidoMaterno=vtnNuevoTrabajador.txtApMa.getText();
            String sexo=opcionSexo;
            String DNI=vtnNuevoTrabajador.txtDni.getText();
            String fechaNacimiento=vtnNuevoTrabajador.txtFechNac.getText();
            String distrito=(String) vtnNuevoTrabajador.cbDsitritoRes.getSelectedItem();
            String direccion=vtnNuevoTrabajador.txtDirec.getText();
            String telefono=vtnNuevoTrabajador.txtTelf.getText();
            String correoElectronico=vtnNuevoTrabajador.txtEmail.getText();
            String asignacionFamiliar=(String) vtnNuevoTrabajador.cbAsig.getSelectedItem();
            int idArea=Integer.parseInt((String) vtnNuevoTrabajador.cbArea.getSelectedItem());
            int idPuesto=Integer.parseInt((String) vtnNuevoTrabajador.cbPuesto.getSelectedItem());
            int idRetencion=Integer.parseInt((String) vtnNuevoTrabajador.cbReten.getSelectedItem());
            String rutaFoto=vtnNuevoTrabajador.txtRutaFoto.getText();
    
            boolean registro=empleadoDAO.InsertarEmpleado(idEmpleado,rutaFoto, nombres, 
                    apellidoPaterno, apellidoMaterno, sexo, DNI, fechaNacimiento, 
                    distrito, direccion, telefono, correoElectronico, 
                    asignacionFamiliar, idArea, idPuesto, idRetencion);
            if(registro)
            {
                JOptionPane.showMessageDialog(null,"Registro exitoso!! :)");
            }else
            {
                JOptionPane.showMessageDialog(null,"Error al registrar!! :(");
            }
        }
        
    } 
    
    //utilizar metodo hasta crear areaDAO y puestoDAO
    public String generarCodigo(){
        String codigoEmpleado="";
        String area=(String) vtnNuevoTrabajador.cbArea.getSelectedItem();
        String puesto=(String) vtnNuevoTrabajador.cbPuesto.getSelectedItem();
        int numeroEmp= 1000+empleadoDAO.ContarRegistros();   
        if(Integer.parseInt(area)<10)
        { 
            area="0"+area;
        }
        if(Integer.parseInt(puesto)<10)
        {
            puesto="0"+puesto;
        }
        codigoEmpleado=area+puesto+String.valueOf(numeroEmp);
        
        return codigoEmpleado;
    }
}
