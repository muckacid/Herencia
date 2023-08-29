/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import db.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Opcion;
import model.Persona;
import model.Trabajador;

/**
 *
 * @author morag
 */
public class Herencia {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Inicializacion del menu
        ArrayList<Opcion> listaOpciones = new ArrayList<>();
        listaOpciones.add(new Opcion(0, "Salir"));
        listaOpciones.add(new Opcion(1, "Crear"));
        listaOpciones.add(new Opcion(2, "Eliminar"));
        listaOpciones.add(new Opcion(3, "Modificar"));
        listaOpciones.add(new Opcion(4, "Ver"));
        listaOpciones.add(new Opcion(5, "Listar"));
        
        // Definicion de variables globales
        boolean runAplication = true;
        Data data = new Data();
        
        // Estructura del sistema
        do {
            
            mostrarMenu(listaOpciones);
            int op = input.nextInt();
            String msj = "Ejecucion de la opcion -> " + listaOpciones.get(op);
            switch (op) {
                case 0 -> {
                    System.out.println(msj);
                    runAplication = false;
                }
                case 1 -> { // Este bloque de codigo tiene finalidad crear una persona
                    System.out.println(msj);
                    // mostrar el formulario -> retorna(Persona)
                    // almacenar persona en una variable
                    Trabajador trabajador = formCreatePerson();
                    // agregar a la lista
                    data.createWorker(trabajador);
                    // Mostrar al usuario que trabajador se registro
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Trabajador Registrado");
                    System.out.println(trabajador);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                case 2 -> {
                    System.out.println(msj);

                }
                case 3 -> {
                    System.out.println(msj);

                }
                case 4 -> {
                    System.out.println(msj);

                }
                case 5 -> {
                    System.out.println(msj);

                }
                default -> {
                    System.out.println(msj);

                }
            }
        } while (runAplication);
        
        Persona per = new Persona("max", "moraga", LocalDate.of(1994, 01, 25), "+569 26311601", "18646384-6");
        System.out.println(per);
    }
    
    // Formulario para la creacion de una persona
    public static Trabajador formCreatePerson() {
        
        // Formulario Persona
        // Componente nombre
        System.out.println("Crear Persona");
        System.out.print("Ingrese Nombre : ");
        String nombre = input.next();

        // Componente apellido
        System.out.print("Ingrese apellido : ");
        String apellido = input.next();

        // Componente de fecha
        System.out.println("[->] FECHA ");
        System.out.print("Ingrese el año : ");
        int year = input.nextInt();

        System.out.print("Ingrese el mes : ");
        int month = input.nextInt();

        System.out.print("Ingrese el dia : ");
        int day = input.nextInt();

        LocalDate fecha = LocalDate.of(year, month, day);

        // Componente Phone
        System.out.println("Ingresar el numero de telefono : ");
        String phone = input.next();

        // Componente rut
        System.out.println("Ingresar el Rut : ");
        String rut = input.next();
        
        // Componenete Cargo
        System.out.println("Ingresar Cargo del trabajador : ");
        String cargo = input.next();
        
        // Componenete sueldo
        System.out.println("Ingresar sueldo del trabajador : ");
        int sueldo = input.nextInt();

        Trabajador trabajador = new Trabajador(cargo, sueldo, nombre, phone, fecha, phone, rut);
        return trabajador;
    }

    public static void mostrarMenu(ArrayList<Opcion> lista){
        System.out.println("+--------------------------------------+");
        System.out.println("|           Menu de opciones           |");
        System.out.println("+--------------------------------------+");
        for (int index = 0; index < lista.size(); index++) {
            System.out.println(lista.get(index));
        }
        System.out.println("+--------------------------------------+");
        
    }

}
