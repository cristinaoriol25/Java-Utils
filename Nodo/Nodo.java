package Nodo;
public class Nodo <E>{
    private final E elemento;
    private Nodo siguiente;
    public Nodo(E element){
        this.elemento = element;
        siguiente = null;
    }
    public E getElemento(){
        return elemento;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }

    public boolean notSiguiente(){
        return siguiente == null;
    }
}
