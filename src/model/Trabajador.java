/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author morag
 */
public class Trabajador extends Persona{
    
    private String cargo;
    private int sueldo;

    public Trabajador() {
    }

    public Trabajador(String cargo, int sueldo, String name, String last_name, LocalDate birthday, String phone, String rut) {
        super(name, last_name, birthday, phone, rut);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        String intro = "\n";
        String separador = "|------------------------------------------------|";
        return "" +
            "| Cargo               : " + cargo + intro + 
            "| Sueldo              : " + sueldo + intro + 
            "| Nombre              : " + this.getName() + intro +
            "| Apellido            : " + this.getLast_name() + intro +
            "| Fecha de nacimiento : " + this.getBirthday().toString() + intro +
            "| Telefono            : " + this.getPhone() + intro +
            "| RUT                 : " + this.getRut() + intro ;
    }

}
