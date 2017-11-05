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
public class ControladorCDT implements ActionListener{
    
    VtnNuevoTrabajador vtnNuevoTrabajador = new VtnNuevoTrabajador();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    String opcionSexo;
    IUControlTiempos iuControlTiempos = new IUControlTiempos();
    
    public ControladorCDT(IUControlTiempos iuControlTiempos,
            VtnNuevoTrabajador vtnNuevoTrabajador){
        this.iuControlTiempos=iuControlTiempos;
        this.vtnNuevoTrabajador=vtnNuevoTrabajador;
        this.iuControlTiempos.btnNuevoTrabajador.addActionListener(this);
    }
    
    public void InicializarNuevoTrabajador(){
    
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==iuControlTiempos.btnNuevoTrabajador)
        {
            JOptionPane.showMessageDialog(null,"ACABAS DE APRETAR EL BOTON GRABAR :-)");
            vtnNuevoTrabajador.setVisible(true);
            vtnNuevoTrabajador.setLocationRelativeTo(vtnNuevoTrabajador);
            /*
            if(vtnNuevoTrabajador.rbtnHombre.isSelected())
            {
                  opcionSexo="Hombre";
            }else
            {
                  opcionSexo="Mujer";
            }
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
            
            boolean registro=empleadoDAO.InsertarEmpleado(telefono, nombres, 
                    apellidoPaterno, apellidoMaterno, sexo, DNI, fechaNacimiento, 
                    distrito, direccion, telefono, correoElectronico, 
                    asignacionFamiliar, idArea, idPuesto, idRetencion);
            if(registro)
            {
                JOptionPane.showMessageDialog(null,"Registro exitoso!! :)");
            }else
            {
                JOptionPane.showMessageDialog(null,"Error al registrar!! :(");
            }*/
        }
    }
}
