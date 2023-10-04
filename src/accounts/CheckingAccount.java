package accounts;

public class CheckingAccount extends Account { //рассчетный
    public CheckingAccount(String name, long balanse) {
        super(name, balanse);
    }

    @Override
    public boolean pay(long amount) {
        if (balanse - amount >= 0) {
            balanse -= amount;
            return true;
        }
        return false;
    }

}

