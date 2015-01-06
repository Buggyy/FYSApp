/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import connectivity.DatabaseManager;
import connectivity.QueryManager;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.admin.AdminFront;
import view.employee.EmployeeFront;
import view.manager.ManagerFront;

/**
 *
 * @author Gebruiker
 */
public class Frame {

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
    private DatabaseManager manager = new DatabaseManager();
    private QueryManager qm = new QueryManager(manager);
    
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
        showPanel(new ManagerFront());

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
        showPanel(new AdminFront());

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
        showPanel(new EmployeeFront());

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
    
    public static QueryManager getQueryManager() {
        return getInstance().qm;
    }
    
    public DatabaseManager getDatabaseManager() {
        return manager;
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
                    JOptionPane.showMessageDialog(null,"Application failed to launch","Failure",JOptionPane.WARNING_MESSAGE);
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
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Application failed to launch","Failure",JOptionPane.WARNING_MESSAGE);
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
                    JOptionPane.showMessageDialog(null,"Application failed to launch","Failure",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
