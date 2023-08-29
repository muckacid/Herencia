package db;

import java.util.ArrayList;
import model.Persona;
import model.Trabajador;


/**
 *
 * @author morag
 */
public class Data {
    private ArrayList<Trabajador> listaDeTrabajadores;
    
    public Data(){
        listaDeTrabajadores = new ArrayList<>();
    }
    
    public void createWorker(Trabajador trabajador){
        // crear sentencia o consulta
        // por objeto coneccion vamos a ejecutar la consulta
        // 
        listaDeTrabajadores.add(trabajador);
    }
    
    public Trabajador getWorkerById(int id){
        Trabajador trabajador = listaDeTrabajadores.get(id);
        return trabajador;
    }
    
    public void deleteWorker(int id){
        listaDeTrabajadores.remove(id);
    }
    
    public void updateWorker(int id, Trabajador trabajador){
        listaDeTrabajadores.set(id, trabajador);
    }
}
