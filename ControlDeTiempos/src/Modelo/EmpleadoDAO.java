/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author diego
 */
public class EmpleadoDAO {
    Conexion conexion;
    
    public EmpleadoDAO(){
        conexion=new Conexion();
    }
    
    public boolean InsertarEmpleado(String idEmpleado,
        String nombres,String apellidoPaterno,String apellidoMaterno,String sexo,
        String DNI,String fechaNacimiento,String DistritoResidencia,
        String direccion,String telefono,String correoElectronico,
        String asignacionFamiliar,int idArea,int idPuesto,
        int idRetencion){
        
        boolean registro=false;
        try
        {
           Connection accesoDB=conexion.getConexion();
           CallableStatement cs = accesoDB.prepareCall("{call usp_graba_empleado("
                   + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
           
           cs.setString(1,idEmpleado);
           cs.setString(2,nombres);
           cs.setString(3,apellidoPaterno);
           cs.setString(4,apellidoMaterno);
           cs.setString(5,sexo);
           cs.setString(6,DNI);
           cs.setString(7,fechaNacimiento);
           cs.setString(8,DistritoResidencia);
           cs.setString(9,direccion);
           cs.setString(10,telefono);
           cs.setString(11,correoElectronico);
           cs.setString(12,asignacionFamiliar);
           cs.setInt(13,idArea);
           cs.setInt(14,idPuesto);
           cs.setInt(15,idRetencion);
           
           int filasAfect=cs.executeUpdate();
           if(filasAfect>0)
           {
               registro=true;
           }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return registro;
    }
    
}
