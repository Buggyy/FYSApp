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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.FYSApp;
import model.Client;
import model.Luggage;

/**
 *
 * @author chrisverra
 * @description Generates and saves a PDF file
 */
public class PDFGenerator {

    private PDDocument document;
    private PDPageContentStream contentStream;

    /**
     * Constructor
     */
    public PDFGenerator() {

        this.document = new PDDocument();
        PDPage page = new PDPage();
        this.document.addPage(page);
        try {
            this.contentStream = new PDPageContentStream(document, page);
        } catch (IOException ex) {
            Logger.getLogger(PDFGenerator.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     *
     * @param luggage an array of lost luggage info
     * @param client an array of client info regarding lost luggage
     * @description creates a pdf file
     */
    public void createPDF(Luggage luggage, Client client) {

        // create object for pdf generator
        PDFGenerator pdf = new PDFGenerator();
        // create own content through arrays using querymanager
        pdf.generatePDFReceipt(luggage, client);
        // current date using timestamp
        String currentDate = FYSApp.getDate();
        //name of pdf file
        pdf.save("Lost luggage receipt " + client.getFirstName() + " "
                + client.getLastName() + " " + currentDate + ".pdf");
        JOptionPane.showMessageDialog(null, "PDF saved as: Lost luggage receipt"
                + " " + currentDate + "\n in the root folder of the app");
    }

    /**
     *
     * @param a an array of lost luggage info
     * @param b an array of client info regarding lost luggage
     * @description creates the layout of the pdf
     */
    public void generatePDFReceipt(Luggage a, Client b) {
        try {
            // start of pdf
            this.contentStream.beginText();

            this.contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
            this.contentStream.moveTextPositionByAmount(30, 750);
            this.contentStream.drawString("Insurance Receipt - Corendon");

            this.contentStream.setFont(PDType1Font.HELVETICA, 12);
            this.contentStream.moveTextPositionByAmount(0, -50);

            // Add client data to receipt
            this.contentStream.drawString("Firstname: " + b.getFirstName());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Lastname: " + b.getLastName());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Address: " + b.getAddress());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Zipcode: " + b.getZipCode());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("City: " + b.getCity());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("State: " + b.getState());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Country: " + b.getCountry());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Phone number: " + b.getPhone());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Email: " + b.getEmail());
            this.contentStream.moveTextPositionByAmount(0, -30);
            this.contentStream.drawString("Client Signature: ");
            this.contentStream.moveTextPositionByAmount(170, 110);

            // Add lost luggage data to receipt
            this.contentStream.drawString("Departure from: "
                    + a.getDepartureFrom());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Label code" + a.getLableCode());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Brand: " + a.getBrand());
            this.contentStream.moveTextPositionByAmount(0, -10);
            this.contentStream.drawString("Color: " + a.getColor());
            this.contentStream.moveTextPositionByAmount(0, -10);

            if (a.getMaterial() != null && !a.getMaterial().isEmpty()) {
                this.contentStream.drawString("Material: " + a.getMaterial());
                this.contentStream.moveTextPositionByAmount(0, -10);
            }
            this.contentStream.drawString("Weight class: "
                    + a.getWeightClass());
            this.contentStream.moveTextPositionByAmount(0, -10);

            if (a.getOtherDetails() != null && !a.getOtherDetails().isEmpty()) {
                this.contentStream.drawString("Other details: "
                        + a.getOtherDetails());
                this.contentStream.moveTextPositionByAmount(0, -10);
            }
            this.contentStream.moveTextPositionByAmount(0, -40);
            this.contentStream.drawString("Corendon Signature: ");

            // end of pdf
            this.contentStream.endText();
        } catch (IOException ex) {
            Logger.getLogger(PDFGenerator.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     *
     * @param filename name of the pdf file
     * @description saves a pdf file
     */
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

}
