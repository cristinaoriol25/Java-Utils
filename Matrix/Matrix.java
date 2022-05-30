package Matrix;
import java.util.concurrent.Semaphore;

public class Matrix <E>{ //Clase matriz genérica
    private int filas;
    private int columnas;
    private E [][] matriz;
    private Semaphore mutex = new Semaphore(1);
    public Matrix(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        matriz = (E[][]) new Object[filas][columnas];
    }

    public void set(int fila, int columna, E elemento){
        if(fila >= 0 && fila < filas && columna >= 0 && columna < columnas){
            mutex.acquireUninterruptibly();
            matriz[fila][columna] = elemento;
            mutex.release();
        }else {
            System.out.println("Fuera de rango");
        }
    }

    public E get(int fila, int columna){
        if(fila >= 0 && fila < filas && columna >= 0 && columna < columnas){
            return matriz[fila][columna];
        }else {
            System.out.println("Fuera de rango");
            return null;
        }
    }

    public int getFilas(){
        return filas;
    }

    public int getColumnas(){
        return columnas;
    }

    public void print(){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
