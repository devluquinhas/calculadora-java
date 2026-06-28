package application;

import domain.Operacao;

public class OperacaoItem {
    private final String nome;
    private final Operacao operacao;

    public OperacaoItem(String nome, Operacao operacao) {
        this.nome = nome;
        this.operacao = operacao;
    }

    public String getNome() {
        return nome;
    }

    public Operacao getOperacao() {
        return operacao;
    }

}
