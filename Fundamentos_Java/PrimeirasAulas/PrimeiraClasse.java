package PrimeirasAulas;
/*
 * PrimeiraClasse = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */

public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Hello Word");

        /*
         * Valores (int, double, float, long)
         * Texto (String)
         * Booleanos (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 8758849949973995000L;
        String dadoTipoString = "Eu sou uma String";
        boolean dadoDoTipoBoolean = true;

        // if - else
        if(dadoDoTipoInt == 10){
            System.out.println("Entrou no if do 10");
        } else if(dadoDoTipoInt == 12) {
            System.out.println("Entrou no if do 12");
        } 
        else {
            System.out.println("Falso");
        }

        // While (Enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while(valorInicial < 3){
            System.out.println("O valor Inicial é menor que 3");
            valorInicial++;
        }

        // For
        System.out.println("Inciando o FOR");
        for(int i = 0; i < 4; i++){
            System.out.println("O valor de i é: " + i);
        }

    }
    
}