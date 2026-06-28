package domain;

public class Subtracao implements Operacao {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
