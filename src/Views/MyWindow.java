/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CalculateController;
import Controllers.GeneralController;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author gerardgg
 */
public class MyWindow extends JFrame {

    public JMenuBar menuBar;

    public MyWindow() {
        initWindow();
        setVisible(true);
    }

    public void initWindow() {
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Multifuel calc");

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(new WelcomePanel());

        initMenuBar();
    }

    public void initMenuBar() {
        menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem menuItem;
        GeneralController controller = new GeneralController(this);

        // Exit
        menu = new JMenu("File");

        menuItem = new JMenuItem("Exit");
        menuItem.setActionCommand("exit");
        menuItem.addActionListener(controller);
        menu.add(menuItem);
        menuBar.add(menu);

        // Options
        menu = new JMenu("Options");

        menuItem = new JMenuItem("Add fuel");
        menuItem.setActionCommand("fuelPane");
        menuItem.addActionListener(controller);
        menu.add(menuItem);

        menuItem = new JMenuItem("Calculator");
        menuItem.setActionCommand("calcPane");
        menuItem.addActionListener(controller);
        menu.add(menuItem);
        menuBar.add(menu);

        setJMenuBar(menuBar);
    }
}
