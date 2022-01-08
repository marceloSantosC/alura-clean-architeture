package escola;

import lombok.Data;
import lombok.ToString;

import java.util.List;

// É uma entidade pois tem um Identificador (o CPF)
@Data
public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones;

    public void adicionarTelefone(String ddd, String numero) {
        telefones.add(new Telefone(ddd, numero));
    }

}
