package estructurasPilaCola;

public class TestPilaCola {
    public static void main(String[] args){
        cola <Integer> cola = new cola <Integer>();
        pila <Integer> pila = new pila <Integer>();
//        for(int i = 0; i < 10; i++){
//            cola.push(i);
//            pila.push(i);
//        }
//        System.out.println("Cola: ");
//        cola.print();
//        System.out.println("Pila: ");
//        pila.print();

//        cola <String> cola2 = new cola <String>();
//        pila <String> pila2 = new pila <String>();
//        cola2.push("Hola");
//        cola2.push("Mundo");
//        pila2.push("Hola");
//        pila2.push("Mundo");
//        System.out.println("Cola2: ");
//        cola2.print();
//        System.out.println("Pila2: ");
//        pila2.print();
          pruebaCola();
          pruebaPila();
    }

    public static void pruebaCola(){
        cola <Integer> cola = new cola <Integer>();
        cola.push(5);
        cola.push(17);
        Integer elemento = cola.pop();
        System.out.println("Elemento extraido de la cola   " +  elemento);
        cola.push(21);
        cola.print();

    }

    public static void pruebaPila(){
        pila <Integer> pila = new pila <Integer>();
        pila.push(5);
        pila.push(17);
        Integer elemento = pila.pop();
        System.out.println("Elemento extraido de la pila   " +  elemento);
        pila.push(21);
        pila.print();
    }
}
