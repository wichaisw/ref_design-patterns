package structural.facade;

import java.math.BigDecimal;
import java.util.UUID;

public interface IAccount {
    UUID accountNumber = null;
    BigDecimal amount = new BigDecimal("0.00");
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(IAccount to, BigDecimal amount);
    UUID getAccountNumber();
    BigDecimal getAmount();
    void setAmount(BigDecimal amount);

}
