public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж при сроке кредита 1 год:");
        double MyCredit = service.calculate(1_000_000, 0.0999, 12);
        int NewMyCredit = (int) Math.round(MyCredit);
        System.out.println(NewMyCredit);
        System.out.println();

        System.out.println("Ежемесячный платеж при сроке кредита 2 года:");
        double MyCredit2 = service.calculate(1_000_000, 0.0999, 24);
        int NewMyCredit2 = (int) Math.round(MyCredit2);
        System.out.println(NewMyCredit2);
        System.out.println();

        System.out.println("Ежемесячный платеж при сроке кредита 3 года:");
        double MyCredit3 = service.calculate(1_000_000, 0.0999, 36);
        int NewMyCredit3 = (int) Math.round(MyCredit3);
        System.out.println(NewMyCredit3);
    }
}
