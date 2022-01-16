package br.com.alura.escola.infraestrutura.aluno.service;

import br.com.alura.escola.dominio.aluno.service.CifradorSenha;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CifradorSenhaSpringSecurity implements CifradorSenha {

    private final PasswordEncoder encoder;

    public CifradorSenhaSpringSecurity(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Override
    public boolean validarSeIguais(String valor, String valorCriptografado) {
        return encoder.matches(valor, valorCriptografado);
    }

    @Override
    public String criptografar(String senha) {
        return encoder.encode(senha);
    }
}
