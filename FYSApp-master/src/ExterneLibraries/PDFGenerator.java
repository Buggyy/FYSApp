/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExterneLibraries;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import connectivity.QueryManager;

/**
 *
 * @author chrisverra
 */
public class PDFGenerator {

    PDDocument document;
    PDPageContentStream contentStream;

    public PDFGenerator() {
        try {
            // Create a document and add a page to it
            this.document = new PDDocument();
            PDPage page = new PDPage();
            this.document.addPage(page);

            // Start a new content stream which will "hold" the to be created content
            this.contentStream = new PDPageContentStream(document, page);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void getFoundData(){
        
    }
    // parameters meegeven en basisopmaak maken 
    public void generate() {
        try {
            this.contentStream.beginText();
            this.contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
            // content goes here
            this.contentStream.moveTextPositionByAmount(100, 700);
            this.contentStream.drawString("Month");
            
            this.contentStream.endText();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void save(String filename) {
        try {
            // Make sure that the content stream is closed:
            this.contentStream.close();

            // Save the results and ensure that the document is properly closed:
            this.document.save(filename);
            this.document.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int stringWidth(String s, PDFont font, double fontSize) {
        try {
            return (int) (font.getStringWidth(s) * fontSize / 1000) + 1;
        } catch (IOException ex) {
            // ignore, but return 0
            return 0;
        }
    }
}
