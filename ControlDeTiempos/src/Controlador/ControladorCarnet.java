/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorCarnet {
    private Font fuenteBold = new Font(Font.FontFamily.COURIER,10,Font.BOLD);
    private Font fuenteNormal = new Font(Font.FontFamily.COURIER,8,Font.NORMAL);
    private Font fuenteItalic = new Font(Font.FontFamily.COURIER,5,Font.ITALIC);
    
    public void generarCarnet(String header, String info1, String info2,
            String info3,String info4,String info5,String rutaImagen, String salida){
        
        try
        {
            Document documento = new Document(PageSize.A7,36,36,10,10);
            PdfWriter.getInstance(documento,new FileOutputStream(salida));
            documento.open();
            documento.add(getHeader(header));
            Image imagen = Image.getInstance(rutaImagen);
            imagen.scaleAbsolute(50, 50);
            imagen.setAlignment(Element.ALIGN_CENTER);
            documento.add(imagen);
            documento.add(getInfo(info1));
            documento.add(getInfo(info2));
            documento.add(getInfo(info3));
            documento.add(getInfo(info4));
            documento.add(getInfo(info5));
            documento.close();
            JOptionPane.showMessageDialog(null,"Carnet creado");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en creación de Carnet");
        }
        
    }
    public void generarCarnet2(String header,String rutaImagen, String salida){
        
        try
        {
            Document documento = new Document(PageSize.A7,36,36,10,10);
            PdfWriter.getInstance(documento,new FileOutputStream(salida));
            documento.open();
            documento.add(getHeader(header));
            documento.add(getInfo(" "));
            documento.add(getInfo(" "));
            documento.add(getInfo(" "));
            Image imagen = Image.getInstance(rutaImagen);
            imagen.scaleAbsolute(50, 50);
            imagen.setAlignment(Element.ALIGN_CENTER);
            documento.add(imagen);
            documento.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en creación de Carnet 2");
        }
        
    }
    
    private Paragraph getHeader(String texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }
    
    private Paragraph getInfo(String texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteNormal);
        p.add(c);
        return p;
    }
    
    private Paragraph getFooter(String texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteItalic);
        p.add(c);
        return p;
    }
}
