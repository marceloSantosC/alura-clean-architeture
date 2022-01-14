package br.com.alura.escola.dominio.indicacao;


import br.com.alura.escola.dominio.aluno.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;

}
