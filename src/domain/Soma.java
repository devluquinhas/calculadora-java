package domain;

public class Soma implements Operacao {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}