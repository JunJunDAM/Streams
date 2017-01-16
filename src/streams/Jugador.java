/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.time.LocalDate;

/**
 *
 * @author usu32
 */
public class Jugador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int canastas;
    private Equipo equipo;

    public Jugador(String nombre, LocalDate fechaNacimiento, int canastas, Equipo equipo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.canastas = canastas;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return nombre + "{FechaNacimiento=" + fechaNacimiento + ", canastas=" + canastas + ", equipo=" + equipo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
}
