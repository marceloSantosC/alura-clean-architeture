package br.com.alura.escola.infraestrutura.aluno.reposotorio;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.repositorio.RepositorioAlunos;


import java.util.ArrayList;
import java.util.List;

public class RepositorioAlunosEmMemoria implements RepositorioAlunos {

    private List<Aluno> alunosSalvos;

    public RepositorioAlunosEmMemoria() {
        alunosSalvos = new ArrayList<>();
    }

    @Override
    public void matricular(Aluno aluno) {
        alunosSalvos.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return alunosSalvos.stream()
                .filter((aluno) -> aluno.getCpf().equals(cpf.toString())).findFirst()
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @Override
    public List<Aluno> listarAlunosMatriculados() {
        return alunosSalvos;
    }
}
