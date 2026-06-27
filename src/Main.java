import application.CalculadoraService;
import domain.OperacaoMatematica;
import domain.Operadores;
import presentation.Menu;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica operador = new Operadores();
        CalculadoraService servico = new CalculadoraService(operador);
        Menu menu = new Menu(servico);

        // Iniciar
        menu.start();
    }
}