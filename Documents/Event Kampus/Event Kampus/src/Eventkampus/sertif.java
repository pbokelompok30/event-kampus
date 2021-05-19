/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventkampus;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Try WIguna
 */
public class sertif {
    public static void main(String[]args){     
        try {
                Document doc = new Document ();
		PdfWriter.getInstance(doc,new FileOutputStream("d:/hellotext.pdf"));
		doc.open();
                doc.add(new Paragraph("example"));
		doc.close();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("itext PDF program executed");
		}    
}
