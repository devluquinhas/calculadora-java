import application.CalculadoraService;
import application.OperacaoItem;
import domain.Soma;
import domain.Subtracao;
import presentation.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OperacaoItem> operacoes = List.of(
            new OperacaoItem("Soma", new Soma()),
            new OperacaoItem("Subtração", new Subtracao())
        );
        CalculadoraService servico = new CalculadoraService(operacoes);
        Menu menu = new Menu(servico);

        // Iniciar
        menu.start();
    }
}