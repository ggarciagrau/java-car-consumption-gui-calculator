/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.AddFuelController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author gerardgg
 */
public class AddFuelPanel extends JPanel {

    public JTextField fuelName, fuelPrice;
    public JPanel dataPanel;
    public JButton addButton;

    public AddFuelPanel() {

        setLayout(new GridLayout(2, 1));

        // Setting data panel
        dataPanel = new JPanel();
        GridLayout gl = new GridLayout(3, 3, 0, 5);
        dataPanel.setLayout(gl);

        dataPanel.add(new JLabel("Fuel name: "));
        fuelName = new JTextField(15);
        dataPanel.add(fuelName);

        dataPanel.add(new JLabel("Price: "));
        fuelPrice = new JTextField(15);
        dataPanel.add(fuelPrice);
        add(dataPanel);

        addButton = new JButton("Add");
        add(addButton);

    }

}
