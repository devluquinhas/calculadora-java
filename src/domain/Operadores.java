package domain;

public class Operadores implements OperacaoMatematica {

    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) { return a - b; }
}
