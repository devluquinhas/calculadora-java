import application.CalculadoraService;
import application.OperacaoItem;
import domain.Soma;
import domain.Subtracao;
import presentation.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OperacaoItem> operacoes = new ArrayList<>();

        // Serviços
        operacoes.add(new OperacaoItem("Soma", new Soma()));
        operacoes.add(new OperacaoItem("Subtração", new Subtracao()));

        CalculadoraService servico = new CalculadoraService(operacoes);
        Menu menu = new Menu(servico);

        // Iniciar
        menu.start();
    }
}