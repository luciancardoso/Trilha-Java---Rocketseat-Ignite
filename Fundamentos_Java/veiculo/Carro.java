package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando o Carro");
    }

    @Override
    public void frear() {
       System.out.println("Freando o Carro");
    }
    
}
