package application;
import domain.OperacaoMatematica;

public class CalculadoraService {
    private final OperacaoMatematica operador;

    public CalculadoraService(OperacaoMatematica operador) {
        this.operador = operador;
    }

    public double execute(int operacao, double numeroA, double numeroB) {
        double resultado = 0;
        switch (operacao) {
            // Soma
            case 1:
                resultado = operador.soma(numeroA, numeroB);
                break;
            // Subtração
            case 2:
                // Ainda vai ser feito
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        return resultado;
    }
}
