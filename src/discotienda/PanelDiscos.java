/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Jonathan
 */
public class PanelDiscos extends JPanel implements ActionListener{

     private JLabel discos;
    
    public PanelDiscos() {
        
        setBackground(Color.CYAN);
        Dimension d = getSize(); 
        
        
        add( new JLabel( "Artista:" ));
        JComboBox artista = new JComboBox();
        add(artista);
        
        add( new JLabel( "                                 ") );
        
        
        add( new JLabel( "Discos:" ));
        JComboBox discos = new JComboBox();
        add(discos);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

  
 
    
    
}
