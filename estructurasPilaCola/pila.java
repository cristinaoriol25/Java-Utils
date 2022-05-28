package estructurasPilaCola;
import Nodo.Nodo;
public class pila <E> {
    private Nodo <E> tope;

    private int size;
    public pila(){
        tope = null;
        size = 0;
    }
    public boolean isEmpty(){
        return tope == null;
    }
    public int size(){
        return size;
    }
    public void push(E elemento){
        Nodo <E> nuevo = new Nodo <E>(elemento);
        nuevo.setSiguiente(tope);
        tope = nuevo;
        size++;
    }
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E elemento = tope.getElemento();
        tope = tope.getSiguiente();
        size--;
        return elemento;
    }

    public void print(){
        Nodo <E> aux = tope;
        while(aux != null){
            System.out.println(aux.getElemento());
            aux = aux.getSiguiente();
        }
    }
}
