package escola;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// É uma entidade pois tem um Identificador (o CPF)
@Data
@Builder
public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones;

    private Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefones = new ArrayList<>();
    }

    public static Aluno comNomeCPFEmail(String nome, CPF cpf, Email email) {
        return new Aluno(cpf, nome, email);
    }

    public void adicionarTelefone(String ddd, String numero) {
        telefones.add(new Telefone(ddd, numero));
    }

}
