package accounts;

public abstract class Account implements MoneyTarget {//Реализуем абстрактный класс
    protected String name;//Реализуем инкапсуляцию через модификатор доступа protected
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

    // Перевод со счета у кого вызвали на счет, указанный в параметрах
    public boolean transfer(Account accountTo, int amount) {
        return this.pay(amount) && accountTo.add(amount);
    }

    @Override
    public boolean accept(int money) {
        return add(money);
    }//

    public long getBalanse() {
        return balanse;
    }
}
