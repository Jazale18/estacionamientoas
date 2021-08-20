package controlador.tadPila;

public class TadPila<T> implements Pila<T> {
	String nombre;
	NodoPila<T> pila;
	
	public TadPila () {
		pila = null;
	}
	
	public TadPila(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

    public boolean pilaVacia () {
      	return pila == null;
    }
        
    public void eliminarPila () {
      	pila = null;
    }

    public T cima () throws PilaVacia {
    	if (pilaVacia ())
       		throw new PilaVacia ("La pila est� vac�a");
       	return pila.dato;
    }
        
    public void apilar (T dato) {
        NodoPila<T> aux;
        aux = new NodoPila<>(dato, pila);
        pila = aux;
    }

    public T desapilar () throws PilaVacia {
        T resultado;
        if (pilaVacia ()) {  
             throw new PilaVacia ("Desapilar: La pila est� vac�a");
        }
        resultado = pila.dato;
        pila = pila.siguiente;
        return resultado;
    }

    public void decapitar () throws PilaVacia {
        if (pilaVacia ()) {  
             throw new PilaVacia ("Decapitar: La pila est� vac�a");
        }
        pila = pila.siguiente;
    }

    public void imprimirPila () {
        NodoPila<T> aux;
        System.out.print ("Estado de la pila " + this.nombre + ": ");
        aux = pila;
        while (aux != null) {
            System.out.print (aux.dato + " ");
            aux = aux.siguiente;
        }
        System.out.println ();
    }
        
    public int numElemPila () {
        NodoPila<T> aux;	
        int resul;
        
        aux = pila;
        resul = 0;
        while (aux != null) {
         	++resul;
        	aux = aux.siguiente;
        }
        return resul;
    }
}