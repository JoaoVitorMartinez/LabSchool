package br.com.labschool.exception;

public class InputException extends RuntimeException {
    private String messagem;

    public InputException(String messagem) {
        super(messagem);
    }

    public String messagem() {
        return messagem;
    }
}
