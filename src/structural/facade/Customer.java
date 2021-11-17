package structural.facade;

import java.math.BigDecimal;
import java.util.UUID;

public class Customer {

    public static void main(String[] args) {
        BankService myBankService = new BankService();

        UUID mySaving = myBankService.createNewAccount("saving", new BigDecimal("500.00"));
        UUID myInvestment = myBankService.createNewAccount("investment", new BigDecimal("1000.00"));

        myBankService.transferMoney(mySaving, myInvestment, new BigDecimal("300.00"));
    }
}
