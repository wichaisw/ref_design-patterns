package structural.facade;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.UUID;

public class BankService {

// Facade hide complexity
// Prevent all client classes from seeing the account objects and how these accounts behave.

//    can wrap more than one interface
    private Hashtable<UUID, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<UUID, IAccount>();
    }

    public UUID createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;

        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }

        if(newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return null;
    }

    public void transferMoney(UUID from, UUID to, BigDecimal amount) {

        IAccount fromAccount = this.bankAccounts.get(from);
        IAccount toAccount = this.bankAccounts.get(to);

        System.out.println("saving: " + fromAccount.getAmount());
        System.out.println("invest: " + toAccount.getAmount());
        fromAccount.transfer(toAccount, amount);

        System.out.println("saving: " + fromAccount.getAmount());
        System.out.println("invest: " + toAccount.getAmount());
    }
}
