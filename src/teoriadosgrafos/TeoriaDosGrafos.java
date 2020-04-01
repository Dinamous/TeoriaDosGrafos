/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import gui.TelaMain;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author 201811000014
 */
public class TeoriaDosGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaMain TP = new TelaMain();
    
       
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        TP.setLocation(dim.width/2-TP.getSize().width/2, dim.height/2-TP.getSize().height/2);
       
        TP.setVisible(true);
    }
}