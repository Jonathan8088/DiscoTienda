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
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Jonathan
 */
public class PanelDiscos extends JPanel implements ActionListener{

     private JLabel discos;
     
     private JLabel artist;
     
     private JLabel disco;
     
     JComboBox artista;
    
    public PanelDiscos() {
        
        setBorder(BorderFactory.createTitledBorder("Discos"));
        
        setBackground(Color.WHITE);
        Dimension d = getSize(); 
        setLayout(null);
        
        artist = new JLabel ("Artista");
        artist.setBounds(50, 30, 50, 20);
        add(artist);
        JComboBox artista = new JComboBox();
        artista.setBounds(100, 30, 150, 20);
        add(artista);
        
        
        
        
        disco = new JLabel ("Disco");
        disco.setBounds(50, 60, 50, 20);
        add(disco);
        JComboBox discos = new JComboBox();
        discos.setBounds(100, 60, 150, 20);
        add(discos);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

  
 public void actualizarArtista(String nombreArtista) {
        artista.addItem(nombreArtista);
    }
    
    
}
