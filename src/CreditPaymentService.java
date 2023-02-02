public class CreditPaymentService {
    public double calculate(int s, double p, int n) {
        double p2 = p / 12;

        double k = p2 + p2 / (Math.pow((1 + p2), n) - 1);
        double a = k * s;

        return a;
    }
}
