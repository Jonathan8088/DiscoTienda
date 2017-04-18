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
    private String genero;
    /**
     * atributo que contiene la nacionalidad del artista
     */
    private String nacionalidad;
    /**
     * atributo que contiene los discos del artista
     */
    private Discos discos;

    public Artista(String nombre, String genero, String nacionalidad, Discos discos) {
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.discos = discos;
    }

    public Artista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Discos getDiscos() {
        return discos;
    }

    public void setDiscos(Discos discos) {
        this.discos = discos;
    }

   
    
    
}
