package estructurasPilaCola;
import Nodo.Nodo;
import java.util.concurrent.Semaphore;
public class pila <E> {

    private Semaphore mutex = new Semaphore(1);
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
        mutex.acquireUninterruptibly();
        Nodo <E> nuevo = new Nodo <E>(elemento);
        nuevo.setSiguiente(tope);
        tope = nuevo;
        size++;
        mutex.release();
    }
    public E pop(){
        mutex.acquireUninterruptibly();
        if(isEmpty()){
            return null;
        }
        E elemento = tope.getElemento();
        tope = tope.getSiguiente();
        size--;
        mutex.release();
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
