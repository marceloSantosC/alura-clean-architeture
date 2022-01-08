package escola;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {


    @Test
    void nao_deve_instaciar_cpf_com_valor_invalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));

        assertThrows(IllegalArgumentException.class, () -> new CPF(""));

        assertThrows(IllegalArgumentException.class, () -> new CPF("abc"));

        assertThrows(IllegalArgumentException.class, () -> new CPF("1020"));
    }

    @Test
    void deve_instanciar_cpf_valido() {

        assertDoesNotThrow(() -> new CPF("141.990.860-05"));

        assertDoesNotThrow(() -> new CPF("16712405025"));

    }

}
