/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jonathan
 */
public class PanelTitulo extends JPanel{

     private JLabel imagen;
    
     private JLabel etiquetaNombre;
     
     private JLabel etiquetaDiscoTienda;
     
    public PanelTitulo() {
        setBackground(Color.WHITE);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        
        etiquetaNombre = new JLabel("Jonathan Sosa ");
        add(etiquetaNombre);
        ImageIcon icon = new ImageIcon("imagenes/imagen.JPG");        
        imagen = new JLabel();
        imagen.setIcon(icon);
        add(imagen);
        
        setBackground(Color.WHITE);
        
        etiquetaDiscoTienda = new JLabel("DISCOTIENDA \n DISCOS 1000 ");
        add(etiquetaDiscoTienda);
        
        setBorder(new LineBorder(Color.GRAY));
    }
    
    
    
    
}
