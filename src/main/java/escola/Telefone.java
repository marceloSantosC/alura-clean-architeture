package escola;

import java.util.Objects;


// Só pode ser identificado por meio de todos atributos e por isso é um value object
public class Telefone {

    private static final String REGEX_DDD = "[0-9]{2}";
    private static final String REGEX_NUMERO = "[0-9]{8,9}";

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {
        ddd = Objects.requireNonNull(ddd).replaceAll( "[^\\d]", "" );
        numero = Objects.requireNonNull(numero).replaceAll( "[^\\d]", "" );

        if (isDDDInvalido(ddd) || isNumeroInvalido(numero)) {
            throw new IllegalArgumentException("Telefone inválido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public static boolean isDDDInvalido(String ddd){
        if (ddd == null) return true;
        return !ddd.matches(REGEX_DDD);
    }

    public static boolean isNumeroInvalido(String numero){
        if (numero == null) return true;
        return !numero.matches(REGEX_NUMERO);
    }

    @Override
    public String toString() {
        return ddd + numero;
    }
}
