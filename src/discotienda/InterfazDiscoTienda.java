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
        setSize(800, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
       
        
        panelImagen = new PanelTitulo( );
        panelImagen.setBounds(10, 10, 780, 130);
        add(panelImagen);
        
        panelDiscos = new PanelDiscos( );
        panelDiscos.setBounds(10, 140, 390, 350);
        add(panelDiscos);
        
        panelCanciones = new PanelCanciones( );
        panelCanciones.setBounds(400, 140, 390, 350);
        add(panelCanciones);
        
        panelOpciones = new PanelOpciones( );
        panelOpciones.setBounds(10, 500, 780, 50);
        add(panelOpciones);
        
        
         setVisible(true);
    }

    public PanelTitulo getPanelImagen() {
        return panelImagen;
    }

    public void setPanelImagen(PanelTitulo panelImagen) {
        this.panelImagen = panelImagen;
    }

    public PanelDiscos getPanelDiscos() {
        return panelDiscos;
    }

    public void setPanelDiscos(PanelDiscos panelDiscos) {
        this.panelDiscos = panelDiscos;
    }

    public PanelCanciones getPanelCanciones() {
        return panelCanciones;
    }

    public void setPanelCanciones(PanelCanciones panelCanciones) {
        this.panelCanciones = panelCanciones;
    }

    public PanelOpciones getPanelOpciones() {
        return panelOpciones;
    }

    public void setPanelOpciones(PanelOpciones panelOpciones) {
        this.panelOpciones = panelOpciones;
    }
    
    
}
