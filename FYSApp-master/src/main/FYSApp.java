package main;

import connectivity.DatabaseManager;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.*;

/**
 * @version 1
 * @author chrisverra, amrishheddes, stefanlobato, jerryrump, larsvanalphen,
 * marijnbakker, danielstern Doel: Het maken van een kofferapplicatie.
 */
public final class FYSApp {

    /**
     * Define frame width, height and name
     */
    public static final int FRAME_WIDTH = 1024;
    public static final int FRAME_HEIGHT = 600;
    public static final String NAME = "Zoek juh köffer";
    /**
     * static fonts which are used within the application
     */
    public static final Font FONT_10_PLAIN = new Font("Verdana", Font.PLAIN, 10);
    public static final Font FONT_10_BOLD = new Font("Verdana", Font.BOLD, 10);
    public static final Font FONT_12_BOLD = new Font("Verdana", Font.BOLD, 12);
    public static final Font FONT_16_BOLD = new Font("Verdana", Font.BOLD, 16);

    private JFrame mainWindow;

    /**
     * singleton of the application
     */
    private static FYSApp instance = new FYSApp();

    private FYSApp() {
    }

    //Database en Querymanager moet hierin initialized worden; Vul nog aan.
    public void initialize() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Error setting LookAndFeelClassName: " + e);
        }

    }

    //Start de mainwindow. 
    public void startup() {
        mainWindow = new JFrame(NAME);
        mainWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);

        //windowlistener om de applicatie te sluiten
        mainWindow.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });

        mainWindow.getContentPane().setLayout(new BorderLayout());
        new LoginScreen().setVisible(true);

        //mainWindow.setVisible(true); geeft witte scherm wtf
    }

    public void showPanel(JPanel panel) {
        mainWindow.getContentPane().removeAll();
        mainWindow.getContentPane().add(panel, BorderLayout.CENTER);
        mainWindow.getContentPane().validate();
        mainWindow.getContentPane().repaint();
    }

    //method om de main window te sluiten
    public void exit() {
        mainWindow.setVisible(false);
        shutdown();
    }

    //Database shutdown moet hierin nog toegevoegd worden
    private void shutdown() {
        mainWindow.dispose();
    }

    /**
     * @return the instance of this class
     */
    public static FYSApp getInstance() {
        return instance;
    }

    public static void main(String args[]) {
        final FYSApp application = FYSApp.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    application.initialize();
                    application.startup();
                } catch (Exception e) {
                    System.out.println("Application" + application.getClass().getName() + "failed to launch");
                }
            }
        });
    }
}
