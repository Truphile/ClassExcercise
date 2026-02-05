import java.math.BigDecimal;

public class Account implements Comparable<Account>{

    private String name;
    private BigDecimal balance;

    public Account (String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {return String.format("This account belongs to  %s");};

    @Override
    public int compareTo(Account account) {
        if (this.balance.doubleValue() < account.balance.doubleValue())
            return account.balance.intValue() - this.balance.intValue();
        else if (this.balance.doubleValue() > account.balance.doubleValue()) {
            return this.balance.intValue() - account.balance.intValue();

        }
        return 0;
    }
}
