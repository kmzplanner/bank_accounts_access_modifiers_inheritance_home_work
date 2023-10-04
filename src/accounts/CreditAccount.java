package accounts;

public class CreditAccount extends Account { //кредитный
    public CreditAccount(String name, long balanse) {
        super(name, balanse);
    }

    @Override
    public boolean add(long amount) {
        if (balanse + amount <= 0) {
            balanse += amount;
            return true;
        }
        return false;
    }
}
