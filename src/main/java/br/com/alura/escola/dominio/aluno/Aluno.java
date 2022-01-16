package br.com.alura.escola.dominio.aluno;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// É uma entidade pois tem um Identificador (o CPF)
public class Aluno {

    private final CPF cpf;
    private final String nome;
    private final Email email;
    private final List<Telefone> telefones;
    private final String senha;

    public Aluno(CPF cpf, String nome, Email email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefones = new ArrayList<>();
    }

    public String getCpf() {
        return cpf.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.toString();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

}
