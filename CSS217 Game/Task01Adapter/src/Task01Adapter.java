import java.math.BigDecimal;

public class Task01Adapter implements IPaymentGateway {
    private final LegacyBillingSystem legacy;

    public Task01Adapter(LegacyBillingSystem legacy) {
        this.legacy = legacy;
    }

    public void processPayment(int customerId, BigDecimal amountInDollars) {
        if (amountInDollars == null) {
            throw new IllegalArgumentException("amount is null");
        }
        if (amountInDollars.signum() < 0) {
            throw new IllegalArgumentException("amount is negative");
        }
        long cents = amountInDollars
                .multiply(BigDecimal.valueOf(100))
                .longValueExact();
        legacy.chargeCustomerInCents(customerId, cents);
    }
}