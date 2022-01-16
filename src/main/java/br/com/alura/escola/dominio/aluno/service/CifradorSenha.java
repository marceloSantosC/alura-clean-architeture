package br.com.alura.escola.dominio.aluno.service;

public interface CifradorSenha {

    boolean validarSeIguais(String valor, String valorCriptografado);

    String criptografar(String senha);

}
