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
import QueryManager.QueryManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.FYSApp;
import main.Frame;

/**
 *
 * @author chrisverra
 */
public class PDFGenerator {

    PDDocument document;
    PDPageContentStream contentStream;
    ResultSet rs = null;
    ResultSetMetaData rsmetadata = null;
    public int columns = 0;
    Vector columns_name = new Vector();
    Vector rows_name = new Vector();

    public PDFGenerator() {
        
        this.document = new PDDocument();
        PDPage page = new PDPage();
        this.document.addPage(page);
        try {
            this.contentStream = new PDPageContentStream(document, page);
        } catch (IOException ex) {
            Logger.getLogger(PDFGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getFoundData(){
        
    }
    // parameters meegeven en basisopmaak maken 
    /**
     * 
     * @param a
     * @param b 
     */
    public void generatePDF(Vector a, Vector b) {
       
        try {
            this.contentStream.beginText();
            this.contentStream.setFont(PDType1Font.HELVETICA, 10);
            
            this.contentStream.moveTextPositionByAmount(30, 700);
            this.contentStream.drawString((String) a.elementAt(0));
            
            for(int i = 1; i <= a.size(); i++){
                this.contentStream.moveTextPositionByAmount(30, 0);
                this.contentStream.drawString((String) a.elementAt(1));
            }
         
            
            
//            this.contentStream.moveTextPositionByAmount(100, 360);
//            int y = -20;
//            for (int i = 0; i < a.size(); i++) {
//                this.contentStream.drawString(a.get(i)+ "");
//                this.contentStream.moveTextPositionByAmount(0, y - 5);
//            }
//            
//            this.contentStream.moveTextPositionByAmount(100, 360);
//            y = -20;
//            for (int i = 0; i < b.size(); i++) {
//                this.contentStream.drawString(b.get(i)+ "");
//                this.contentStream.moveTextPositionByAmount(0, y - 5);
//                
//            }
            this.contentStream.endText();
        } catch (IOException ex) {
            Logger.getLogger(PDFGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generateReceiptPDF(){
//        rsmetadata = rs.getMetaData();
//
//        columns = rsmetadata.getColumnCount();
//
//        columns_name = new ArrayList<String>();
//        rows_name = new ArrayList<String>();
//
//        for (int i = 1; i < columns; i++) {
//            columns_name.add(rsmetadata.getColumnName(i));
//        }
//        
//        while (rs.next()) {
//
//            rows_name = new ArrayList<String>();
//
//            for (int j = 1; j < columns; j++) {
//                rows_name.add(rs.getString(j));
//            }
//        }
        
        // create object for pdf generator
        PDFGenerator pdf = new PDFGenerator();
        // create own content through arrays using querymanager
        pdf.generatePDF(columns_name, rows_name);
        // current date using timestamp
        String currentDate = FYSApp.getDateTime();
        //name of pdf file
        pdf.save("Lost luggage receipt " + currentDate);
        JOptionPane.showMessageDialog(null, "PDF saved as: Lost luggage receipt"
                + " " + currentDate + "\n in the root folder of the app" );
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

    public static int stringWidth(String s, PDFont font, double fontSize) throws IOException {
        // ignore, but return 0
        
        return (int) (font.getStringWidth(s) * fontSize / 1000) + 1;
    }
    
     /**
     * 
     * @param array1 String array of column names
     * @param array2 String array of data
     * @throws SQLException 
     * @description gets arrays with data from database and parses the arrays 
     * to the pdf generator, after this a pdf is created with the information
     * from the database
     */
    public void generateOverviewPDF(ResultSet rs) throws SQLException, IOException{  
        rsmetadata = rs.getMetaData();

        columns = rsmetadata.getColumnCount();
        
        // reserve an array for the table heading
        String[] tableHead = new String[columns];

        Vector columns_name = new Vector();
        Vector rows_name = new Vector();

        for (int i = 1; i < columns; i++) {
            columns_name.add(rsmetadata.getColumnName(i));
        }
        
        while (rs.next()) {

            //Vector rows_name = new Vector();

            for (int j = 1; j < columns; j++) {
                rows_name.add(rs.getString(j));
            }
        }
        
        // create object for pdf generator
        PDFGenerator pdf = new PDFGenerator();
        // create own content through arrays using querymanager
        pdf.generatePDF(columns_name, rows_name);
        // current date using timestamp
        String currentDate = FYSApp.getDateTime();
        //name of pdf file
        pdf.save(currentDate + " Found.pdf");
        JOptionPane.showMessageDialog(null, "PDF saved as: " + currentDate
                + " Found.pdf \n in the root folder of the app" );
    }
}
