/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import QueryManager.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.admin.AdminLuggageFound;
import view.employee.FoundLuggageOverview;
import view.manager.ManagerLuggageFound;

/**
 *
 * @author Gebruiker
 */
public class Frame {

    public static final String CONTACT_MESSAGE = "Please contact our support at:\n"
            + "Email: support@corendon.nl\n"
            + "Phone: +31623451212 or +29693399339";

    public static final int MANAGER_WIDTH = 1024;
    public static final int MANAGER_HEIGHT = 600;
    public static final String MANAGER_NAME = "Manager View";

    public static final int ADMIN_WIDTH = 1024;
    public static final int ADMIN_HEIGHT = 600;
    public static final String ADMIN_NAME = "Admin View";

    public static final int EMPLOYEE_WIDTH = 1024;
    public static final int EMPLOYEE_HEIGHT = 600;
    public static final String EMPLOYEE_NAME = "Employee View";

    private static JFrame mainWindow;
    private JMenuBar menuBar = new JMenuBar();
    private DatabaseManager manager = new DatabaseManager();
    private QueryManager qm = new QueryManager(manager);

    private LuggageManager lm = new LuggageManager();

    private SearchManager sm = new SearchManager();
    private TableManager tm = new TableManager();
    private UserManager um = new UserManager();
    private ClientManager cm = new ClientManager();

    private static Frame instance = new Frame();

    private Frame() {
    }

    public void initialize() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println("Error setting LookAndFeelClassName: " + e);
        }
    }

    public void startManager() {
        mainWindow = new JFrame(MANAGER_NAME);
        mainWindow.setSize(MANAGER_WIDTH, MANAGER_HEIGHT);
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
        showPanel(new ManagerLuggageFound());

        mainWindow.setVisible(true);
    }

    public void startAdmin() {
        mainWindow = new JFrame(ADMIN_NAME);
        mainWindow.setSize(ADMIN_WIDTH, ADMIN_HEIGHT);
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
        showPanel(new AdminLuggageFound());

        mainWindow.setVisible(true);
    }

    public void startEmployee() {
        mainWindow = new JFrame(EMPLOYEE_NAME);
        mainWindow.setSize(EMPLOYEE_WIDTH, EMPLOYEE_HEIGHT);
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
        showPanel(new FoundLuggageOverview());

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

    public static Frame getInstance() {
        return instance;
    }

    public void menu() {
        UIManager.put("PopupMenu.border",
                BorderFactory.createLineBorder(Color.black, 1));

        JSeparator sep = new JSeparator();

        JMenu optionsMenu = new JMenu("Options");
        JMenu helpMenu = new JMenu("Help");
        optionsMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(optionsMenu);
        menuBar.add(helpMenu);

        JMenuItem contact = new JMenuItem("Contact", KeyEvent.VK_N);
        JMenuItem userManual = new JMenuItem("User Manual", KeyEvent.VK_N);
        JMenuItem logout = new JMenuItem("Logout", KeyEvent.VK_N);
        JMenuItem exit = new JMenuItem("Exit", KeyEvent.VK_N);

        helpMenu.add(contact);
        menuBar.add(sep);
        helpMenu.add(userManual);

        optionsMenu.add(logout);
        menuBar.add(sep);
        optionsMenu.add(exit);

        exit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        logout.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        userManual.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManualActionPerformed(evt);
            }
        });

        contact.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        mainWindow.setJMenuBar(menuBar);
    }

    public static void ManagerFrame() {
        final Frame applicatie = Frame.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    applicatie.initialize();
                    applicatie.startManager();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "Application failed to launch", "Failure",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void AdminFrame() {
        final Frame applicatie = Frame.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    applicatie.initialize();
                    applicatie.startAdmin();
                    applicatie.menu();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "Application failed to launch", "Failure",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void EmployeeFrame() {
        final Frame applicatie = Frame.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    applicatie.initialize();
                    applicatie.startEmployee();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, 
                            "Application failed to launch", "Failure", 
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        Frame.shutdown();
        FYSApp.logout();
    }

    private void userManualActionPerformed(java.awt.event.ActionEvent evt) {
        File filee = new File("Usermanual.pdf");
        String absolutePath = filee.getAbsolutePath();
        try {
                Process process = Runtime.getRuntime()
                        .exec("rundll32 url.dll, FileProtocolHandler "
                                + absolutePath);
                process.waitFor();
        } catch (Exception e) {
            System.out.println(":: -----Exception---- ::\n" + e);
        }
    }

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(mainWindow, CONTACT_MESSAGE);
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
}
