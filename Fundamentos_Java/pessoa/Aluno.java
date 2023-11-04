package pessoa;

public class Aluno extends Pessoa {
    
    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    String imprimiDadosDaPessoa() {
        System.out.println(super.imprimiDadosDaPessoa());
        return "Você é um Aluno(a)";
    }

}
