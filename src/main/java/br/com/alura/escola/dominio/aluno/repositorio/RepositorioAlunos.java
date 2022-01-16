package br.com.alura.escola.dominio.aluno.repositorio;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarAlunosMatriculados();
}
