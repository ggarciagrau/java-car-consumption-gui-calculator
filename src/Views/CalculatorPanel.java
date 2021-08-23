/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.FuelStation;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gerardgg
 */
public class CalculatorPanel extends JPanel {

    JPanel distancePanel, quantityPanel, resultPanel;
    public JButton calculateButton;
    public JTextField distanceInput, quantityInput, consumptionResult, totalPriceResult, priceKmResult;
    public JComboBox combo1;

    public CalculatorPanel() {
        setLayout(new FlowLayout());
        initPanel();
    }

    private void initPanel() {
        // General setup
        GridLayout gl = new GridLayout(5, 1);
        gl.setHgap(5);
        gl.setVgap(5);
        setLayout(gl);

        // Distance setup
        distancePanel = new JPanel(new FlowLayout());
        distancePanel.add(new JLabel("Distance"));
        distanceInput = new JTextField();
        distanceInput.setPreferredSize(new Dimension(50, 25));
        distancePanel.add(distanceInput);
        
        add(distancePanel);

        // Quantity setup
        resultPanel = new JPanel(new FlowLayout());
        resultPanel.add(new JLabel("Quantity"));
        quantityInput = new JTextField();
        quantityInput.setPreferredSize(new Dimension(50, 25));
        resultPanel.add(quantityInput);
        
        add(resultPanel);
        
        // Combobox setup
        combo1 = new JComboBox();
        for (int i = 0; i < FuelStation.getFuelList().size(); i++) {
            combo1.addItem(FuelStation.getFuelList().get(i).getName());
        }
        add(combo1);
        
        // Calc button and results setup
        calculateButton = new JButton("Calculate");
        resultPanel = new JPanel();
        
        consumptionResult = new JTextField();
        consumptionResult.setPreferredSize(new Dimension(50, 25));
        
        totalPriceResult = new JTextField();
        totalPriceResult.setPreferredSize(new Dimension(50, 25));
        
        priceKmResult = new JTextField();
        priceKmResult.setPreferredSize(new Dimension(50, 25));
        
        resultPanel.add(new JLabel("Consumption"));
        resultPanel.add(consumptionResult);
        resultPanel.add(new JLabel("$ total"));
        resultPanel.add(totalPriceResult);
        resultPanel.add(new JLabel("$/km"));
        resultPanel.add(priceKmResult);
        
        add(calculateButton);
        add(resultPanel);
    }
}
