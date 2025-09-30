import java.util.Stack;

public class Pilas {
    
    public static void main(String[] args){
        
        // Implementacion de pilas 
        System.out.println("Implementacion de pilas");
        Stack<Integer> pila = new Stack<>();
        System.out.println("caso de prueba 1 - pila de enteros: ");
        //Se pone en duda si la pila esta vacia, hasta este punto lo es ya que no he especificado los elementos de esta
        System.out.println("Esta vacia? " + pila.isEmpty());
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        for(Integer pila1 : pila) {
            System.out.println(pila1);
        }
        //See elimina 3 valores, deben de eliminarse los ultimos en entrar
        pila.pop();
        pila.pop();
        pila.pop();
        //ponemos en duda si el 3 sigue vigente o ya no
        System.out.println("Esta el 3? " + (pila.search(3) != -1));
        System.out.println("Ultimo agregado: " + pila.peek());
        System.out.println();
        
        
        Stack<String> pila3 = new Stack<>();
        System.out.println("caso de prueba 2 - pila de strings: ");
        pila3.push("J");
        pila3.push("O");
        pila3.push("S");
        pila3.push("U");
        pila3.push("E");
        for(String pila2 : pila3) {
            System.out.println(pila2);
        }
        System.out.println("Esta vacia? " + pila3.isEmpty());
        System.out.println("Ultimo (peek): " + pila3.peek());
        System.out.println("Contiene 'B'? " + (pila3.search("B") != -1));
        System.out.println("Contiene 'E'? " + (pila3.search("E") != -1));
        //eliminamos un valor y despues preguntamos si este en especifico sigue estando en la lista o no
        pila3.pop();
        System.out.println("Contiene 'E'? " + (pila3.search("E") != -1));
        System.out.println();
        
    }
    
    
}