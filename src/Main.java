public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long monthPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("на 12 месяцев- ОР:Сумма ежемесячного платежа:87_911 рублей ФР:Сумма ежемесячного платежа: " + monthPayment + " рублей");

        long monthPayment1 = service.calculate(1_000_000, 9.99, 24);
        System.out.println("на 24 месяца- ОР:Сумма ежемесячного платежа:46_140 рублей ФР:Сумма ежемесячного платежа: " + monthPayment1 + " рублей");

        long monthPayment2 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("на 36 месяцев- ОР:Сумма ежемесячного платежа:32_262 рублей ФР:Сумма ежемесячного платежа: " + monthPayment2 + " рублей");

    }
}