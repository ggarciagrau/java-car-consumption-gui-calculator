/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gerardgg
 */
public class WelcomePanel extends JPanel {
    
    public WelcomePanel() {
        initPanel();
    }
    
    private void initPanel() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Multifuel calculator v3");
        label.setHorizontalAlignment(JLabel.CENTER);
        setBackground(Color.BLACK); // bg color
        label.setForeground(Color.WHITE); // color
        add(label, BorderLayout.CENTER);
    }
    
}
