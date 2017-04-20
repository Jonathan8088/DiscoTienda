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
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class DialogoArtista extends JDialog implements ActionListener{
    
    private static final String ACEPTAR = "ACEPTAR";
    /**
     * label que muestra la palabra artista
     */
    private JLabel Jlartista;
    /**
     * label que muestra la palabra genero
     */
    private JLabel JLgenero;
    /**
     * label que muestra la palabra nacionalidad
     */
    private JLabel JLnacionalidad;
    /**
     * textfiel donde se escribira el nombre del artista
     */
    private JTextField nombre;
    /**
     * atributo que contiene los distintos generos
     */
    private Genero genero;
    /**
     * atributo que contiene las nacionalidades
     */
    private Nacionalidad nacionalidad;
    /**
     * boton de aceptar
     */    
    private JButton aceptar;

   JPanel panel;
   /**
    * conbobox donde se desplegaran generos y nacionalidades
    */
   JComboBox Gen, Nacion;
   /**
    * lista del artista
    */
   private List<Artista> listaArtista;
    
   private Artista artista;
    
   private InterfazDiscoTienda ventana;
   
    public DialogoArtista() {
       
        List<Artista> artist = new ArrayList<Artista>();
       
        setSize(400, 300);
       
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
      
        setTitle( "CREAR ARTISTA               " );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        setLayout( null);
   
        
        Jlartista = new JLabel ("Artista");
        Jlartista.setBounds(20, 20, 50, 20);
        add(Jlartista);
        nombre = new JTextField();
        nombre.setBounds(100, 20, 150, 20);
        add( nombre );      
        
        JLgenero = new JLabel ("Genero");
        JLgenero.setBounds(20, 50, 50, 20);
        add(JLgenero);
        JComboBox genero = new JComboBox(Genero.values());
        genero.setBounds(100, 50, 150, 20);
        add(genero);
        
        
        
        JLnacionalidad = new JLabel ("Nacionalidad");
        JLnacionalidad.setBounds(20, 90, 80, 20);
        add(JLnacionalidad);
        JComboBox nacionalidad = new JComboBox(Nacionalidad.values());
        nacionalidad.setBounds(100, 90, 150, 20);
        add(nacionalidad);
       
        aceptar = new JButton( "Aceptar" );
        aceptar.setActionCommand( ACEPTAR );
        aceptar.addActionListener(this);
        aceptar.setBounds(100, 130, 100, 20);
        add( aceptar );
        setVisible(true);
        
    }
    
     /**
      * accion que se ejecuta al presioanr el boton de aceptar
      * @param e 
      */
    @Override
    public void actionPerformed(ActionEvent e) {
          if(validarDatosArtista()){
            artista = new Artista(nombre.getText(), (Genero) Gen.getSelectedItem(), ((Nacionalidad) Nacion.getSelectedItem()));
            listaArtista.add(artista);
            JOptionPane.showMessageDialog(this, "Artista creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanelDiscos().actualizarArtista(artista.getNombre());
            
       }
    }
     /**
      * vacia los campos del artista
      */
     private void vaciarDatos() {
        nombre.setText("");
        Jlartista.setForeground(Color.BLACK);
        Gen.setSelectedIndex(0);
        Nacion.setSelectedIndex(0);
    }
    
 /**
  * valida que los datos del artista esten completos
  * @return true o false segun sea el caso
  */
    private boolean validarDatosArtista() {
        if(nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Jlartista.setForeground(Color.red);
            return false;
        } else if(Gen.getSelectedItem() == Genero.SELECCION) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un genero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }  else if(Nacion.getSelectedItem() == Nacionalidad.SELECCION) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una nacionalidad.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        return true;
    }

    
}