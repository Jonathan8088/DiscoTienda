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
public class Discos {
    /**
     * atributo que contiene la descripcion del disco
     */
    private String descripcion;
    /**
     * atributo que contiene la direccion de la imagen
     */
    private String imagen;
    /**
     * atributo que contiene el precio del disco
     */
    private String precio;
    /**
     * atributo que contiene las canciones de los discos
     */
    private Canciones canciones;
/**
 * constructor que contiene todos los atributos de la clase
 * @param descripcion
 * @param imagen
 * @param precio
 * @param canciones 
 */
    public Discos(String descripcion, String imagen, String precio, Canciones canciones) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.canciones = canciones;
    }

    
/**
 * constructor vacio
 */
    public Discos() {
    }
/**
 * retorna la descripcion del dicso
 * @return descripcion
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * modifica la descripcion
 * @param descripcion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * retorna la direccion de la imagen
 * @return imagen
 */
    public String getImagen() {
        return imagen;
    }
/**
 * modifica la direccion de la imagen
 * @param imagen 
 */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
/**
 * retorna el valor del precio
 * @return precio
 */
    public String getPrecio() {
        return precio;
    }
/**
 * modifica el valor del precio
 * @param precio 
 */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
/**
 * retornaa las canciones del disco
 * @return canciones
 */
    public Canciones getCanciones() {
        return canciones;
    }
/**
 * modifica las canciones del disco
 * @param canciones 
 */
    public void setCanciones(Canciones canciones) {
        this.canciones = canciones;
    }
    
    
    
}
