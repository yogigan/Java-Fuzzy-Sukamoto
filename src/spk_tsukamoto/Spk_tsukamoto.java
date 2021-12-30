/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spk_tsukamoto;


import form.Mainpg;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acer
 */
public class Spk_tsukamoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            LookAndFeel lnf = new com.jtattoo.plaf.acryl.AcrylLookAndFeel();
            UIManager.setLookAndFeel(lnf);
            
        } catch (UnsupportedLookAndFeelException err) {
            JOptionPane.showMessageDialog(null, "Look and Feel gagal ditampilkan" + err, "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            
            Mainpg mainPg = new Mainpg();
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(),
                    frameSize = screenSize.getSize();
            mainPg.setLocationRelativeTo(null);
            mainPg.setVisible(true);
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed When Loading Main Page! \n Error @ :" + e.getMessage());
        }
    }
    
}
