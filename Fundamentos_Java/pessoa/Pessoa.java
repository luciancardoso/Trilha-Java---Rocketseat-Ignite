package pessoa;

public class Pessoa {
    // nome, idade, cpf

    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    String imprimiDadosDaPessoa() {
        return "O nome da pessoa e " + nome + " a idade e " + 
                idade + " o documento e " + cpf;
    }

}
