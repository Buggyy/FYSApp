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

/**
 *
 * @author Daniel Stern IS 106
 */
public final class FYSApp {

    /*
    *   Styling Conventions:
    *   Properties of:
        - Textbox: Calibri 12px plain
        - Textbox Labels: Calibri 18px plain
        - Frame title Labels: Calibri 24px bold
        - Buttons: Calibri 14px plain (UPPERCASE, except for logout/login screen)
                   Dimensions:(X = 530px, Y = 400px)
                   GEEN BORDERS
    */
   
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

    //Start de mainwindow. en include 
    public void startup() {
        mainWindow = new JFrame(NAME);
        mainWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);

        //method shutdown om applicatie te sluiten.
        mainWindow.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });

        mainWindow.getContentPane().setLayout(new BorderLayout());
        showPanel(new view.LoginScreen());

        mainWindow.setVisible(true);
    }

    public void showPanel(JPanel panel) {
        mainWindow.getContentPane().removeAll();
        mainWindow.getContentPane().add(panel, BorderLayout.CENTER);
        mainWindow.getContentPane().validate();
        mainWindow.getContentPane().repaint();
    }

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
        final FYSApp applicatie = FYSApp.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    applicatie.initialize();
                    applicatie.startup();
                } catch (Exception e) {
                    System.out.println("Application" + applicatie.getClass().getName() + "failed to launch");
                }
            }
        });
    }
}
