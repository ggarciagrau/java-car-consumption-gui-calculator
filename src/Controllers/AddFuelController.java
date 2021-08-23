/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Fuel;
import Models.FuelStation;
import Views.AddFuelPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gerardgg
 */
public class AddFuelController implements ActionListener {

    private Fuel newFuel;
    public AddFuelPanel view;

    public AddFuelController(AddFuelPanel fuelView) {
        this.view = fuelView;

        initListener();
    }

    public void initListener() {
        this.view.addButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            String fuelName = this.view.fuelName.getText();
            Double fuelPrice = Double.valueOf(this.view.fuelPrice.getText());

            Fuel newFuel = new Fuel(fuelName, fuelPrice);
            FuelStation.getFuelList().add(newFuel);
            JOptionPane.showMessageDialog(view, "Fuel correctly added");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Name must be a string and price a number");
        }
    }

}
