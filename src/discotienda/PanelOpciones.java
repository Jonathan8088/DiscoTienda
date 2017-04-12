/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class PanelOpciones  extends JPanel implements ActionListener{

    private static final String ARTISTA = "ARTISTA";
    
    private static final String DISCOS = "DISCOS";
    
    private static final String CANCIONES = "CANCIONES";
    
    private JButton btnArtista;
    
    private JButton btnDiscos;
    
    private JButton btnCanciones;
    
    public PanelOpciones() {
        setLayout(new GridLayout(1, 3));
        setBackground(Color.WHITE);
        
        btnArtista = new JButton("Cambiar Puntos");
        btnArtista.setActionCommand(ARTISTA);
        btnArtista.addActionListener(this);
        add(btnArtista);
        
        btnDiscos = new JButton("Cambiar Puntos");
        btnDiscos.setActionCommand(ARTISTA);
        btnDiscos.addActionListener(this);
        add(btnDiscos);
        
        btnCanciones = new JButton("Cambiar Puntos");
        btnCanciones.setActionCommand(ARTISTA);
        btnCanciones.addActionListener(this);
        add(btnCanciones);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
}
