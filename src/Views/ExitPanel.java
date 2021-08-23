/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gerardgg
 */
public class ExitPanel extends JPanel {

    public ExitPanel() {

        int confirmClose = JOptionPane.showConfirmDialog(this,
                "Do you really want to close the application?");

        if (JOptionPane.OK_OPTION == confirmClose) {
            System.exit(0);
        }
    }

}
