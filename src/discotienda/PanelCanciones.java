/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class PanelCanciones extends JPanel{

    public PanelCanciones() {
        setBackground(Color.GRAY);
        Dimension d = getSize();
        System.out.print(d.getHeight() + " " + d.getWidth()); 
    }
 
    
    
}
