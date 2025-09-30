import java.util.HashMap;

public class Hash {
    public static void main(String[] args){
        //Crea el hashmap con ids de estudiantes y sus nombres
        HashMap<String, Integer> Ids = new HashMap<>();
        
        Ids.put("Josue", 1411984);
        Ids.put("Carlos", 1211543);
        Ids.put("Valeria", 1412729);
        Ids.put("Martha", 1310185);
        
        //hacemos casos de prueba como vosualizar si un id existe o no, tambien visualizar el id con solo escribir 
        // del alumno.
        System.out.println(Ids);
        System.out.println(Ids.containsValue(1412729));
        System.out.println(Ids.get("Carlos"));
        
        //Se suplanta el id de carlos para posteriormente imprimir de nuevo el hashmap
        Ids.put("Carlos", 1311536);
         System.out.println(Ids);
         
        //eliminamos a martha y vovemos a imprimir para solo ver a Josue, Carlos y Valeria
        Ids.remove("Martha");
        System.out.println("Después de eliminar a Martha: " + Ids);
    }
}