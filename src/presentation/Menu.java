package presentation;
import application.CalculadoraService;
import application.OperacaoItem;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final CalculadoraService servico;
    private final Scanner scanner = new Scanner(System.in);;
    private final DecimalFormat formatador = new DecimalFormat("#.##");

    public Menu(CalculadoraService servico) {
        this.servico = servico;
    }

    public void start() {
        while (true) {

            List<OperacaoItem> ops = servico.listarOperacoes();

            System.out.printf("[ Calculadora Simples ]%nEstudando o java na prática.");
            System.out.printf("%n%n[ Módulos ]%n");
            for (int i = 0; i < ops.size() ; i++) {
                System.out.printf("%d. %s%n", (i + 1), (ops.get(i).getNome()));
            }
            System.out.println("0. Sair");
            System.out.printf("%n Escolha uma operação: ");

            int operacao = scanner.nextInt();

            // Sair
            if (operacao == 0) { break; }

            System.out.printf("%nInsira o primeiro número: ");
            double numeroA = scanner.nextDouble();
            System.out.print("Insira o segundo número: ");
            double numeroB = scanner.nextDouble();

            // Resultado
            double resultado = servico.execute(operacao - 1, numeroA, numeroB);
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
