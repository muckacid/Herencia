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
public class Persona {
    
    private String name;
    private String last_name;
    private LocalDate birthday;
    private String phone;
    private String rut;
    private int amountChildrens;

    public Persona() {
    }

    public Persona(String name, String last_name, LocalDate birthday, String phone, String rut) {
        this.name = name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.phone = phone;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", last_name=" + last_name + ", birthday=" + birthday + ", phone=" + phone + ", rut=" + rut + '}';
    }
 
    
    
    
}
