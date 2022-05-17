public class CreditPaymentService {
    public long calculate(long creditAmount, double percent, int creditPeriod) {
        double monthPercent = percent / (100 * 12);
        long monthPayment = (long) (creditAmount * (monthPercent + (monthPercent / (Math.pow((1 + monthPercent), creditPeriod) - 1))));

        return monthPayment;
    }

}
