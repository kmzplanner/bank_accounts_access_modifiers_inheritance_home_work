package accounts;

public class Account {
    protected String name;
    protected long balanse;

    public Account(String name, long balanse) {
        this.name = name;
        this.balanse = balanse;
    }

    public boolean pay(long amount) {
        balanse -= amount;
        return true;
    }

    public boolean add(long amount) {
        balanse += amount;
        return true;
    }

    public long getBalanse() {
        return balanse;
    }

    // Перевод со счета на счет
    public boolean transfer(Account accountTo, int amount) {
        return this.pay(amount) && accountTo.add(amount);
    }

}
