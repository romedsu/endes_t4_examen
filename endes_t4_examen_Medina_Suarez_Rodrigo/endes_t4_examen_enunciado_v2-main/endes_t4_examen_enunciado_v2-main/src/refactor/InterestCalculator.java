package refactor;

/*
 * Refactoriza el siguiente código de forma para evitar utilizar un número mágico
 * y repetir el número cada vez que se utiliza.
 */
public class InterestCalculator {
    final static int YEAR=365;
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate /YEAR), time * YEAR);
    }
}
