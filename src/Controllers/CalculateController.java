/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Fuel;
import Models.FuelStation;
import Views.CalculatorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gerardgg
 */
public class CalculateController implements ActionListener {

    private Fuel targetFuel;
    public CalculatorPanel view;

    public CalculateController(CalculatorPanel calcView) {
        this.view = calcView;

        initListener();
    }

    public void initListener() {
        this.view.calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            double distance = Double.valueOf(this.view.distanceInput.getText());
            double quantity = Double.valueOf(this.view.quantityInput.getText());

            String fuelName = this.view.combo1.getSelectedItem().toString();

            for (int i = 0; i < FuelStation.getFuelList().size(); i++) {
                if (FuelStation.getFuelList().get(i).getName().equals(fuelName)) {
                    targetFuel = new Fuel(FuelStation.getFuelList().get(i).getName(), FuelStation.getFuelList().get(i).getPrice());
                }
            }

            this.view.consumptionResult.setText(String.valueOf(FuelStation.consumptionCalc(quantity, distance)));
            this.view.totalPriceResult.setText(String.valueOf(FuelStation.totalPriceCalc(quantity, targetFuel.getPrice())));
            this.view.priceKmResult.setText(String.valueOf(FuelStation.kmPriceCalc(distance, targetFuel.getPrice())));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Fill the fields with numbers");
        }

    }

}
