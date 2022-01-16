package br.com.alura.escola.aplicacao.aluno.matricula;

import br.com.alura.escola.aplicacao.aluno.matricula.dto.DadosCadastroAlunoDTO;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.repositorio.RepositorioAlunos;

public class MatriculaAlunoUseCase {

    private final RepositorioAlunos repositorio;

    public MatriculaAlunoUseCase(RepositorioAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void matricular(DadosCadastroAlunoDTO dados) {
        Aluno aluno = dados.toAluno();
        repositorio.matricular(aluno);

    }
}
