package br.com.luciancardoso.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("Usúario Já existe!!!");
    }
}
