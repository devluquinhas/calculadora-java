import application.CalculadoraService;
import application.OperacaoItem;
import java.util.ArrayList;
import java.util.List;
import presentation.Menu;

import domain.Divisao;
import domain.Soma;
import domain.Subtracao;

public class Main {
    public static void main(String[] args) {
        List<OperacaoItem> operacoes = new ArrayList<>();

        // Serviços
        operacoes.add(new OperacaoItem("Soma", new Soma()));
        operacoes.add(new OperacaoItem("Subtração", new Subtracao()));
        operacoes.add(new OperacaoItem("Divisão", new Divisao()));

        CalculadoraService servico = new CalculadoraService(operacoes);
        Menu menu = new Menu(servico);

        // Iniciar
        menu.start();
    }
}