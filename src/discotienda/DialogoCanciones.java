/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class DialogoCanciones extends JDialog implements ActionListener{

    private static final String ACEPTAR = "ACEPTAR";
    
    private JLabel artista;
    
    private JLabel discos;
    
    private JTextField nombreCancion;
    
    private JTextField duracion;
    
     private JButton aceptar;
    
    public DialogoCanciones() {
        setLayout( new GridLayout( 10, 6 ) );
        setTitle( "CREAR CANCIONES" );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        
        add( new JLabel( "Artistas:" ));
        JComboBox artista = new JComboBox();
        add(artista);
    
        add( new JLabel( "Discos:" ));
        JComboBox discos = new JComboBox();
        add(discos);
        
        add( new JLabel( "Nombre de la cancion:" ));
        nombreCancion = new JTextField();
        add( nombreCancion );
        
        add( new JLabel( "Duracion:" ));
        duracion = new JTextField();
        add( duracion );
        
        add( new JLabel( ) );
        add( new JLabel( ) );
        add( new JLabel( ) );
        add( new JLabel( ) );
        
        aceptar = new JButton( "Aceptar" );
        aceptar.setActionCommand( ACEPTAR );
        aceptar.addActionListener(this);
        add( aceptar );
        pack( );
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
    
    
    
    
}
