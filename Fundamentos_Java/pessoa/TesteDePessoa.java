package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Lucian");
        professor.setCpf("33322244499");
        professor.setIdade(32);
        professor.setSalario(4000);

        System.out.println(professor.imprimiDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setNome("Gabrielly");
        aluno.setCpf("22211155533");
        aluno.setIdade(24);
        aluno.setMatricula("3212763");

        System.out.println(aluno.imprimiDadosDaPessoa());
    }
}
