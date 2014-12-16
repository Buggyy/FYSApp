/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExterneLibraries;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;

/**
 *
 * @author Amrit HebDees
 */
public class PDFGenerator {

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("FYStest.pdf"));
        document.open();
        document.add(new Paragraph("Test voor PDF"));
        document.close();
        
        
        
    }
}
