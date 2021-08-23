/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.MyWindow;
import Views.AddFuelPanel;
import Views.CalculatorPanel;
import Views.ExitPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gerardgg
 */
public class GeneralController implements ActionListener {

    MyWindow view;
    
    public GeneralController(MyWindow view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        switch (action) {
            case "fuelPane":
                showFuelPane();
                break;
            case "calcPane":
                showCalcPane();
                break;
            case "exit":
                ExitPanel exit = new ExitPanel();
                break;
        }
    }

    private void showCalcPane() {
        CalculatorPanel calcView = new CalculatorPanel();
        view.setContentPane(calcView);
        view.validate();
        CalculateController calcController = new CalculateController(calcView);
    }

    private void showFuelPane() {
        AddFuelPanel fuelView = new AddFuelPanel();
        view.setContentPane(fuelView);
        view.validate();
        AddFuelController addFuelController = new AddFuelController(fuelView);
    }
    
}
