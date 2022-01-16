package br.com.alura.escola.aplicacao.aluno.matricula.dto;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.Telefone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DadosCadastroAlunoDTO {

    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private List<String> telefones;

    public Aluno toAluno() {
        Aluno aluno = new Aluno(new CPF(cpf), nome, new Email(email), senha);
        telefones.stream().map(Telefone::new).forEach(aluno::adicionarTelefone);
        return aluno;
    }

}
