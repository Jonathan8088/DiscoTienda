/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class DialogoArtista extends JDialog implements ActionListener{
    
    private static final String ACEPTAR = "ACEPTAR";
    
    private JLabel artista;
    
    private JTextField nombre;
    
    private Genero genero;
    
    private Nacionalidad nacionalidad;
        
    private JButton aceptar;

   
    
    public DialogoArtista() {
       
        List<Artista> artist = new ArrayList<Artista>();
        Artista artista = new Artista();
       
        setLayout( new GridLayout( 10, 6 ) );
        setTitle( "CREAR ARTISTA               " );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        
        
        add( new JLabel( "Nombre:" ));
        nombre = new JTextField();
        add( nombre );
        
       
        
        add( new JLabel( "Genero" ));
        JComboBox genero = new JComboBox();
        add(genero);
        genero.addItem("Rock");
        genero.addItem("Pop");
        genero.addItem("Electro");
        genero.addItem("Vallenato");
        artista.setGenero(genero.getSelectedItem().toString());
        
        
        add( new JLabel( "Nacionalidad:" ));
        JComboBox nacionalidad = new JComboBox();
        add(nacionalidad);
        nacionalidad.addItem("Colombia");
        nacionalidad.addItem("U.S.A.");
        nacionalidad.addItem("España");
        nacionalidad.addItem("Mexico");
        artista.setNacionalidad(nacionalidad.getSelectedItem().toString());
        
        artist.add(artista);
        
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
       switch(e.getActionCommand()){
           case ACEPTAR:{
               
       }
    }
    }
    
   

    
}