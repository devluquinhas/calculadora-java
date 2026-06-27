package presentation;
import application.CalculadoraService;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
    private final CalculadoraService servico;
    private final Scanner scanner;
    private final DecimalFormat formatador;

    public Menu(CalculadoraService servico) {
        this.servico = servico;
        this.scanner = new Scanner(System.in);
        this.formatador = new DecimalFormat("#.##");
    }

    public void start() {
        while (true) {
            System.out.printf("[ Calculadora Simples ]%nEstudando o java na prática.");
            System.out.printf("%n%n[ Módulos ]%n1. Soma%n2. Subtração%n0. Sair");
            System.out.printf("%n%n Escolha uma operação: ");

            int operacao = scanner.nextInt();

            // Sair
            if (operacao == 0) {
                break;
            }

            System.out.printf("%nInsira o primeiro número: ");
            double numeroA = scanner.nextDouble();
            System.out.print("Insira o segundo número: ");
            double numeroB = scanner.nextDouble();

            // Resultado
            double resultado = servico.execute(operacao, numeroA, numeroB);
            // Formatação
            String formatado = formatador.format(resultado);

            System.out.printf("%nO resultado foi: %s%n", formatado);

            // Aguardar confirmação de leitura
            scanner.nextLine();
            scanner.nextLine();
        }

        scanner.close();
    }
}
