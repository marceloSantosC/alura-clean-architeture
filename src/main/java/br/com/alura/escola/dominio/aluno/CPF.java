package br.com.alura.escola.dominio.aluno;

import java.util.Objects;

public class CPF {

    public static final String REGEX_CPF_VALIDO = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";

    private final String valor;

    public CPF(String valor) {

        valor = Objects.requireNonNull(valor).replace(".", "").replace("-", "");

        if (isInvalido(valor)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.valor = valor;
    }

    public static boolean isInvalido(String valor) {
        if (valor == null) return true;
        return !valor.matches(REGEX_CPF_VALIDO);
    }

    @Override
    public String toString() {
        return valor;
    }
}
