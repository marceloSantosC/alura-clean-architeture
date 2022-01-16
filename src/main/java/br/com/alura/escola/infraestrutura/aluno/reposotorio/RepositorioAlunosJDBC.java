package br.com.alura.escola.infraestrutura.aluno.reposotorio;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Telefone;
import br.com.alura.escola.dominio.aluno.repositorio.RepositorioAlunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioAlunosJDBC implements RepositorioAlunos {

    private final Connection connection;

    public RepositorioAlunosJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES (?, ?, ?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, aluno.getCpf());
            st.setString(2, aluno.getNome());
            st.setString(3, aluno.getEmail());
            st.execute();

            String sqlTelefone = "INSERT INTO TELEFONE VALUES(?, ?)"; // NÃO É O MELHOR SQL POSSÍVEL
            for (Telefone telefone : aluno.getTelefones()) {
                PreparedStatement stt = connection.prepareStatement(sqlTelefone);
                stt.setString(1, telefone.getDdd());
                stt.setString(2, telefone.getNumero());
                stt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        // IMPLEMENTAÇÃO
        return null;
    }

    @Override
    public List<Aluno> listarAlunosMatriculados() {
        // IMPLEMENTAÇÃO
        return null;
    }
}
