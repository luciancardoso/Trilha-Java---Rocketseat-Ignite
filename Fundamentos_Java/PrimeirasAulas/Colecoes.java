package PrimeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Lucian", 9);
        notas.put("Gabrielly", 10);
        notas.put("Thais", 8);

        // var nota = notas.get("Lucian");
        // System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave e " + key + "o valor e " + value);
        }
    }
}
