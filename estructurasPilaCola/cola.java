package estructurasPilaCola;

import Nodo.Nodo;
import java.util.concurrent.Semaphore;
public class cola <E>{
    private Semaphore mutex = new Semaphore(1);
    private Nodo<E> tope;
    private Nodo <E> primero;
    private int size;
    public cola(){
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
        mutex.acquireUninterruptibly();
        if (isEmpty()){
            tope = nuevo;
            primero = nuevo;
        }else {
            if(primero.notSiguiente()) {
                primero.setSiguiente(nuevo);
            }
            tope.setSiguiente(nuevo);
            tope = nuevo;
        }
        size++;
        mutex.release();
    }
    public E pop(){
        mutex.acquireUninterruptibly();
        if(isEmpty()){
            return null;
        }
        E elemento = primero.getElemento();
        primero = primero.getSiguiente();
        size--;
        mutex.release();
        return elemento;
    }

    public void print(){
        Nodo <E> aux = primero;
        while(aux != null){
            System.out.println(aux.getElemento());
            aux = aux.getSiguiente();
        }
    }
}
