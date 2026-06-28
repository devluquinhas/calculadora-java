import application.CalculadoraService;
import application.OperacaoItem;
import java.util.ArrayList;
import java.util.List;

import domain.Multiplicacao;
import presentation.Menu;

import domain.Divisao;
import domain.Soma;
import domain.Subtracao;

public class Main {
    public static void main(String[] args) {
        List<OperacaoItem> operacoes = new ArrayList<>();

        // Operadores
        operacoes.add(new OperacaoItem("Soma", new Soma()));
        operacoes.add(new OperacaoItem("Subtração", new Subtracao()));
        operacoes.add(new OperacaoItem("Divisão", new Divisao()));
        operacoes.add(new OperacaoItem("Multiplicação", new Multiplicacao()));

        CalculadoraService servico = new CalculadoraService(operacoes);
        Menu menu = new Menu(servico);

        // Iniciar
        menu.start();
    }
}