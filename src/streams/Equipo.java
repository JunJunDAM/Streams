/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;


/**
 *
 * @author usu32
 */
public class Equipo {
    private String nombre;
    private String localidad;

    public Equipo(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", localidad=" + localidad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
}
