public class RewardValue {
    private final double cashValue;
    public static final double MILES_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToMilesToCash(milesValue);
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_CASH_CONVERSION_RATE);
    }

    private static double convertToMilesToCash(int milesValue) {
        return milesValue * MILES_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}