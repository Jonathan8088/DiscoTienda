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
        setLayout(null);
        setBackground(Color.WHITE);
        
        btnArtista = new JButton("Crear Artista");
        btnArtista.setActionCommand(ARTISTA);
        btnArtista.addActionListener(this);
        btnArtista.setBounds(10, 10, 200, 40);
        add(btnArtista);
        
        btnDiscos = new JButton("Crear Disco");
        btnDiscos.setActionCommand(DISCOS);
        btnDiscos.addActionListener(this);
        btnDiscos.setBounds(220, 10, 200, 40);
        add(btnDiscos);
        
        btnCanciones = new JButton("Crear Canciones");
        btnCanciones.setActionCommand(CANCIONES);
        btnCanciones.addActionListener(this);
        btnCanciones.setBounds(430, 10, 200, 40);
        add(btnCanciones);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       switch (e.getActionCommand()) {
            case ARTISTA:
                DialogoArtista d= new DialogoArtista();
                break;
            case DISCOS:
                DialogoDisco dis= new DialogoDisco();
                break;        
            case CANCIONES:
                DialogoCanciones c= new DialogoCanciones();
                break;
        }
    }
 
    
    
}
