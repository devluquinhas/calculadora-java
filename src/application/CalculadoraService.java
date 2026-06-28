package application;
import domain.Operacao;

import java.util.List;

public class CalculadoraService {
    private final List<OperacaoItem> operacoes;

    public CalculadoraService (List<OperacaoItem> operacoes) {
        this.operacoes = operacoes;
    }

    public List<OperacaoItem> listarOperacoes(){
        return operacoes;
    }

    public double execute(int index, double a, double b) {
        return operacoes.get(index).getOperacao().execute(a, b);
    }
}
