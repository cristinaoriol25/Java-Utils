public class TestPilaCola {
    public static void main(String[] args){
        cola <Integer> cola = new cola <Integer>();
        pila <Integer> pila = new pila <Integer>();
        for(int i = 0; i < 10; i++){
            cola.push(i);
            pila.push(i);
        }
//        System.out.println("Cola: ");
//        cola.print();
//        System.out.println("Pila: ");
//        pila.print();

        cola <String> cola2 = new cola <String>();
        pila <String> pila2 = new pila <String>();
        cola2.push("Hola");
        cola2.push("Mundo");
        pila2.push("Hola");
        pila2.push("Mundo");
        System.out.println("Cola2: ");
        cola2.print();
        System.out.println("Pila2: ");
        pila2.print();
    }
}
