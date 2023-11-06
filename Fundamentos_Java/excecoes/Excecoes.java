package excecoes;

import pessoa.Pessoa;

public class Excecoes {

    // Checked exceptions


    // Unchecked exceptions

    public static void main(String[] args) throws Exception {
        // try / catch
        // try {
        //     validarNumero();
        // } catch (Exception e) {
        //     System.out.println("Deu Ruim");
        //     e.printStackTrace();
        // }

        Pessoa p = null;
        p.getCpf();

    }


    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O numero é menor que 100");
        }
    }
    
}