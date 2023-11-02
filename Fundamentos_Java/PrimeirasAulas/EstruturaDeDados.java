package PrimeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucian");
        nomes.add("Gabrielly");
        nomes.add("Thais");

        // System.out.println(nomes.get(0));
        // for( String nome : nomes) {
        //     System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println("o nome e " + nome));
        
    }
    
}
