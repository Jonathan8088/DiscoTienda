/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class InterfazDiscoTienda extends JFrame{
    
    private PanelTitulo panelImagen;
    
    private PanelDiscos panelDiscos;
    
    private PanelCanciones panelCanciones;
    
    private PanelOpciones panelOpciones;
    
    public InterfazDiscoTienda(){
        setTitle("DISCOTIENDA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
       
        
        panelImagen = new PanelTitulo( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelDiscos = new PanelDiscos( );
        getContentPane().add(panelDiscos, BorderLayout.WEST);
        
        panelCanciones = new PanelCanciones( );
        getContentPane().add(panelCanciones, BorderLayout.CENTER);
        
        panelOpciones = new PanelOpciones( );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
        
        
        
         setVisible(true);
    }
}
