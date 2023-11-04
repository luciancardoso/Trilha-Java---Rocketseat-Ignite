package pessoa;

public class Professor extends Pessoa {
    
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    String imprimiDadosDaPessoa(){
        System.out.println(super.imprimiDadosDaPessoa());
        return "Você é um Professor";
    }
}
