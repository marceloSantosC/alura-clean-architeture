package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    void nao_deve_instanciar_telefone_invalido() {

        assertThrows(NullPointerException.class, () -> new Telefone(null, null));

        assertThrows(NullPointerException.class, () -> new Telefone("11", null));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "12345678"));
    }

    @Test
    void deve_instanciar_telefone_celular_valido() {
        Telefone telefone = new Telefone("11", "12345678");
        assertEquals("1112345678", telefone.toString());
    }

    @Test
    void deve_instanciar_telefone_fixo_valido() {
        Telefone telefone = new Telefone("11", "123456789");
        assertEquals("11123456789", telefone.toString());
    }
}
