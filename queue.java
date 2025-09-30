import java.util.LinkedList;
import java.util.Queue;

//Operaciones Queue (FIFO)
public class queue {
    public static void main(String[] args) {

//Agregamos una LinkedList con 4 elementos los cuales seran letras del abecedario
        Queue<String> cola = new LinkedList<>();
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("G");
        // Caso de prueba 1, se usa .peek para poder encontrar el primer elemento de la lista
        System.out.println("caso de prueba 1 - cola inicial ");
        System.out.println(cola);
        System.out.println("Primer elemento: " + cola.peek());

        // Caso de prueba 2, se usa .remove para eliminar el primer elemento de esta lista
        String borrar = cola.remove();
        System.out.println("caso de prueba 2 - elemento eliminado: ");
        System.out.println(borrar);
        //En esta parte al mandar a llamar de nuevo a un nuevo primer elemento debe de imprimir el siguiente elemento
        System.out.println("Nuevo primer elemento: " + cola.peek());
        System.out.println("Cola actual: " + cola);
    }
}
