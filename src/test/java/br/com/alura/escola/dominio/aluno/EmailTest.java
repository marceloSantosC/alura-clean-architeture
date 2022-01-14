package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void nao_deve_instaciar_email_com_valor_invalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("marcelo"));

        assertThrows(IllegalArgumentException.class, () -> new Email("marcelo@gmail"));
    }

    @Test
    void deve_instanciar_email_com_valor_valido() {

        assertDoesNotThrow(() -> new Email("marcelo@gmail.com"));

        assertDoesNotThrow(() -> new Email("marcelo1234@yahoo.com"));

        assertDoesNotThrow(() -> new Email("marcelo1234@uol.com.br"));

        assertDoesNotThrow(() -> new Email("marcelo1234@hotmail.com.br"));

    }
}
