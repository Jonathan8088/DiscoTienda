/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class PanelCanciones extends JPanel{

    public PanelCanciones() {
        setBorder(BorderFactory.createTitledBorder("Canciones"));
        setBackground(Color.white);
        Dimension d = getSize(); 
    }
 
   /*
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
      
                
        g.setColor(Color.red);
      
        
    } 
 */   
}
