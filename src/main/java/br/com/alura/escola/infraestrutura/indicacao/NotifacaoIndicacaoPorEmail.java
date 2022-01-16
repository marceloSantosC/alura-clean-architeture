package br.com.alura.escola.infraestrutura.indicacao;

import br.com.alura.escola.aplicacao.aluno.indicacao.NotificacaoIndicacaoAluno;
import br.com.alura.escola.dominio.aluno.Aluno;

public class NotifacaoIndicacaoPorEmail implements NotificacaoIndicacaoAluno {

    @Override
    public void notificar(Aluno indicado) {
        // Lógica para notificação por e-mail
    }
}
