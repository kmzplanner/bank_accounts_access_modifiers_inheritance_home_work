package accounts;

public class SavingsAccount extends Account { //накопительный
    protected long minBalanse;

    public SavingsAccount(String name, long balance, long minBalanse) {
        super(name, balance);
        this.minBalanse = minBalanse;
    }

    @Override
    public boolean pay(long amount) {
        if (balanse - amount <= minBalanse) {
            balanse -= amount;
            return true;
        }
        return false;
    }

}
