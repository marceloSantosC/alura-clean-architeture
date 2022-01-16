package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricula.MatriculaAlunoUseCase;
import br.com.alura.escola.aplicacao.aluno.matricula.dto.DadosCadastroAlunoDTO;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.repositorio.RepositorioAlunos;
import br.com.alura.escola.infraestrutura.aluno.reposotorio.RepositorioAlunosEmMemoria;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatriculaAlunoLinhaComando {

    public static void main(String[] args) {
        String nome = "Fulano Oliveira";
        String cpf = "12345678900";
        String email = "aluno@email.com";
        String senha = "1234";
        List<String> telefones = Arrays.asList("1199999-9999", "1198888-8888");

        DadosCadastroAlunoDTO dados = new DadosCadastroAlunoDTO(cpf, nome, email, senha, telefones);

        RepositorioAlunosEmMemoria repo = new RepositorioAlunosEmMemoria();
        MatriculaAlunoUseCase matriculaAlunoUseCase = new MatriculaAlunoUseCase(repo);
        matriculaAlunoUseCase.matricular(dados);

        System.out.println(repo.listarAlunosMatriculados().stream().map(Aluno::getNome).collect(Collectors.toList()));
    }
}
