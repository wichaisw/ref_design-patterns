package structural.facade;

import java.math.BigDecimal;
import java.util.UUID;

public class Chequing implements IAccount {

    private BigDecimal amount = new BigDecimal("0.00");
    private UUID accountNumber = null;

    public Chequing(BigDecimal initAmount) {
        this.amount = initAmount;
        this.accountNumber = UUID.randomUUID();
    }


    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount to, BigDecimal amount) {
        this.setAmount(this.amount.subtract(amount));
        to.setAmount(amount.add(to.getAmount()));
    }

    @Override
    public UUID getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
