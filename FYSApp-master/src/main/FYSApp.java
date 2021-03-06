package main;

import Connectivity.UserManager;
import Connectivity.DatabaseManager;
import Connectivity.SearchManager;
import Connectivity.TableManager;
import Connectivity.ClientManager;
import Connectivity.LuggageManager;
import Connectivity.QueryManager;
import ExterneLibraries.PDFGenerator;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
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
     * Finals for warnings
     */
    public static final String WARNING_REQUIRED = "Some fields are required to fill in!";
    public static final String WARNING_MUST_SELECT_SOMETHING = "You must select something!";
    public static final String NO_VALUE = "";
    public static final double DOUBLE_ZERO = 0.0;
    public static final double ZERO = 0;
    /**
     * Define frame width, height and name
     */
    public static final int MAIN_WIDTH = 340;
    public static final int MAIN_HEIGHT = 600;
    public static final String MAIN_NAME = "Zoek juh köffer";

    /**
     * static fonts which are used within the application
     */
    public static final Font FONT_10_PLAIN = new Font("Verdana", Font.PLAIN, 10);
    public static final Font FONT_10_BOLD = new Font("Verdana", Font.BOLD, 10);
    public static final Font FONT_12_BOLD = new Font("Verdana", Font.BOLD, 12);
    public static final Font FONT_16_BOLD = new Font("Verdana", Font.BOLD, 16);

    private static JFrame mainWindow;
    private DatabaseManager manager = new DatabaseManager();
    private QueryManager qm = new QueryManager(manager);
    private LuggageManager lm = new LuggageManager();
    private SearchManager sm = new SearchManager();
    private TableManager tm = new TableManager();
    private UserManager um = new UserManager();
    private ClientManager cm = new ClientManager();
    private PDFGenerator pdf = new PDFGenerator();

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println("Error setting LookAndFeelClassName: " + e);
        }
    }

    //  Arraylist of all the airports from the database
    public static ArrayList<String> airportsList;

    public static ArrayList<String> getAirportsList() {
        return airportsList;
    }

    public static void setAirports() {
        ArrayList<String> airports = FYSApp.getQueryManager().getAirports();
        for (int i = 0; i < airports.size(); i++) {
            airportsList.add(airports.get(i));
        }
    }
    

//Start de mainwindow. en include 
    public void startup() {
        mainWindow = new JFrame(MAIN_NAME);
        mainWindow.setSize(MAIN_WIDTH, MAIN_HEIGHT);
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
    public static void shutdown() {
        mainWindow.dispose();
    }

    // Gets current date (timestamp)
    public static String getDate() {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        return date;
    }

    // Gets current date and time (timestamp)
    public static String getDateTime() {
        String dateTime = new SimpleDateFormat("dd-MM-yyyy:k:m")
                .format(new Date());
        return dateTime;
    }

    /**
     * @return the instance of this class
     */
    public static FYSApp getInstance() {
        return instance;
    }

    public QueryManager getQm() {
        return qm;
    }

    public static QueryManager getQueryManager() {
        return getInstance().qm;
    }

    public LuggageManager getLm() {
        return lm;
    }

    public static LuggageManager getLuggageManager() {
        return getInstance().lm;
    }

    public SearchManager getSm() {
        return sm;
    }

    public static SearchManager getSearchManager() {
        return getInstance().sm;
    }

    public TableManager getTm() {
        return tm;
    }

    public static TableManager getTableManager() {
        return getInstance().tm;
    }

    public UserManager getUm() {
        return um;
    }

    public static UserManager getUserManager() {
        return getInstance().um;
    }

    public ClientManager getCm() {
        return cm;
    }

    public static ClientManager getClientManager() {
        return getInstance().cm;
    }

    public DatabaseManager getDatabaseManager() {
        return manager;
    }
    
    public PDFGenerator getPDFGenerator(){
        return pdf;
    }

    public static void logout() {
        final FYSApp applicatie = FYSApp.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    applicatie.initialize();
                    applicatie.startup();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Application failed to launch", "Failure", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
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
                    JOptionPane.showMessageDialog(null, "Application failed to launch", "Failure", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
