
package controlador;

import java.util.ArrayList;
import java.util.Vector;
import modelo.vehiculo;

public class TadLista {

    public static ArrayList<vehiculo> veh = new ArrayList();

    public void push(vehiculo vehiculo) {
        veh.add(vehiculo);//almacenamos la persona en la lista
    }

    public void editar(int pos, vehiculo vehiculo) {
        veh.set(pos, vehiculo);//almacenamos la persona en la lista
    }

    public void delete(int pos) {
        veh.remove(pos);//almacenamos la persona en la lista
    }

    public boolean esta(String placa) {
        for (int i = 0; i <= veh.size(); i++) {
            if (veh.get(i).getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public vehiculo buscar(String placa) {
        for (int i = 0; i <= veh.size(); i++) {
            if (veh.get(i).getPlaca().equals(placa)) {
                return veh.get(i);
            }
        }
        return null;
    }

    public int llenparq() {
        Vector vector = new Vector();
        for (int i = 0; i < veh.size(); i++) {
            if (veh.get(i).getPlaca() == (null)) {
                vector.addElement(i);
            }
        }
        return vector.size();
    }

    public String buscarD(String placa) {
        for (int i = 0; i <= veh.size(); i++) {
            if (veh.get(i).getPlaca().equals(placa)) {
                return veh.get(i).toString();
            }
        }
        return null;
    }

    public boolean size12() {
        if(veh.size()<=11){
             return true;
        }else{
            return false;
        }
       
    }

    public void mostrarVeh() {
        for (int i = 0; i < veh.size(); i++) {
            System.out.println(veh.get(i).toString());  //se invoca el método toString de la clase Coche                  
        }
    }
    
    public void llenarvacios() {
        vehiculo vehic=new vehiculo(null,null,null,null,null,null,null);
        for (int i = 0; i < 12; i++) {
           push(vehic)    ;         
        }
    }

}
