package br.com.alura.escola.dominio.aluno;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


// Só pode ser identificado por meio de todos atributos e por isso é um value object
@Getter
public class Telefone {

    private static final String REGEX_DDD = "[0-9]{2}";
    private static final String REGEX_NUMERO = "[0-9]{8,9}";

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        criarSeValido(ddd, numero);
    }

    public Telefone(String telefoneCompleto) {
        telefoneCompleto = removerCaracteresInvalidos(telefoneCompleto);
        String ddd = extrairDDD(telefoneCompleto);
        String numero = extrairNumero(telefoneCompleto);
        criarSeValido(ddd, numero);
    }

    private void criarSeValido(String ddd, String numero) {
        ddd = removerCaracteresInvalidos(ddd);
        numero = removerCaracteresInvalidos(numero);

        if (isTelefoneInvalido(ddd, numero)) {
            throw new IllegalArgumentException("Telefone inválido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    private String extrairDDD(String telefoneCompleto) {
        try {
            return Objects.requireNonNull(telefoneCompleto).substring(0, 2);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new IllegalArgumentException("Telefone inválido", e);
        }
    }

    private String extrairNumero(String telefoneCompleto) {
        try {
            return Objects.requireNonNull(telefoneCompleto).substring(2);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new IllegalArgumentException("Telefone inválido", e);
        }
    }

    private String removerCaracteresInvalidos(String dddOuNumero) {
       return Objects.requireNonNull(dddOuNumero).replaceAll( "[^\\d]", "" );
    }

    public static boolean isTelefoneInvalido(String ddd, String numero) {
        return isDDDInvalido(ddd) || isNumeroInvalido(numero);
    }

    private static boolean isDDDInvalido(String ddd){
        if (ddd == null) return true;
        return !ddd.matches(REGEX_DDD);
    }

    private static boolean isNumeroInvalido(String numero){
        if (numero == null) return true;
        return !numero.matches(REGEX_NUMERO);
    }

    @Override
    public String toString() {
        return ddd + numero;
    }
}
