package escola;

public class Email {

    public static final String REGEX_EMAIL_VALIDO = "^([a-z]){1,}([a-z0-9._-]){1,}([@]){1}([a-z]){2,}([.]){1}([a-z]){2,}([.]?){1}([a-z]?){2,}$";


    private final String endereco;

    public Email(String endereco) {

        if (isInvalido(endereco)) {
            throw new IllegalArgumentException("E-mail inválido");
        }

        this.endereco = endereco;
    }

    public static boolean isInvalido(String emailStr) {
        if (emailStr == null) return true;
        return !emailStr.matches(REGEX_EMAIL_VALIDO);
    }

    @Override
    public String toString() {
        return endereco;
    }

}
