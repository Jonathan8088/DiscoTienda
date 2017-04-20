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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class DialogoDisco extends JDialog implements ActionListener{
    
    private static final String ACEPTAR = "ACEPTAR";
    
    private static final String BUSCAR = "BUSCAR";
        
    private JTextField imagen;
    
    private JTextField descripcion;
    
    private JTextField precio;
    
    private JButton buscar;
    
    private JButton aceptar;
    
    private Discos disco;

    public DialogoDisco() {
        
        Discos disco = new Discos();
        
        setLayout( new GridLayout( 10, 6 ) );
        setTitle( "CREAR DISCO" );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        
        add( new JLabel( "Artistas:" ));
        JComboBox artista = new JComboBox();
        add(artista);
        
        
        add( new JLabel( "Imagen:" ));
        buscar = new JButton( "Buscar Archivo" );
        buscar.setActionCommand( BUSCAR );
        buscar.addActionListener(this);
        add( buscar );
        disco.setImagen(BUSCAR.getClass().toString());
        
        add( new JLabel( "Descripcion:" ));
        descripcion = new JTextField();
        add( descripcion );
        disco.setDescripcion(descripcion.getText());
        
        add( new JLabel( "precio:" ));
        precio = new JTextField();
        add( precio );
        disco.setPrecio(precio.getText());
        
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
            case BUSCAR:
                JFileChooser file=new JFileChooser();
                file.showOpenDialog(this);
                break;
            case ACEPTAR:
                setVisible(false);
        }
    }
    
    
    
}
