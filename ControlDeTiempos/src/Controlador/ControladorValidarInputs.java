
package Controlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class ControladorValidarInputs {
  public void validarsololetras(JTextField campo){
      campo.addKeyListener(new KeyAdapter() {
          public void keyTyped(KeyEvent e){
          char c= e.getKeyChar();
          if (Character.isDigit(c)){
          e.consume();
          }
          
          }
      });
  }  
  
  public void validarsolonumeros(JTextField campo){
      campo.addKeyListener(new KeyAdapter() {
          public void keyTyped(KeyEvent e){
          char c= e.getKeyChar();
          if (!Character.isDigit(c)){
          e.consume();
          }
          
          }
      });
  }
      
   public void limitarcaraceteres(JTextField campo,int cantidad){
      campo.addKeyListener(new KeyAdapter() {
          public void keyTyped(KeyEvent e){
          char c= e.getKeyChar();
          int tam=campo.getText().length();
          if (tam>=cantidad){
          e.consume();
          }
          
          }
      });
   }
}