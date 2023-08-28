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
public class Trabjador extends Persona{
    
    private String cargo;
    private int sueldo;

    public Trabjador() {
    }

    public Trabjador(String cargo, int sueldo, String name, String last_name, LocalDate birthday, String phone, String rut) {
        super(name, last_name, birthday, phone, rut);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    
    
    
    
    
    
}
