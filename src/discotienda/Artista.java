/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

/**
 *
 * @author Jonathan
 */
public class Artista {
    /**
     * atributo que guarda el nombre del artista
     */
    private  String nombre;
    /**
     * atributo que contiene el genero del artista
     */
    private Genero genero;
    /**
     * atributo que contiene la nacionalidad del artista
     */
    private Nacionalidad nacionalidad;
    /**
     * atributo que contiene los discos del artista
     */
    private Discos discos;

    public Artista(String nombre, Genero genero, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

        public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Discos getDiscos() {
        return discos;
    }

    public void setDiscos(Discos discos) {
        this.discos = discos;
    }

   
    
    
}
