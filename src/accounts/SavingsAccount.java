package accounts;
//Рализуем механизм наследования extends от класса Account
public class SavingsAccount extends Account { //Накопительный
    protected long minBalanse;
// Реализуем возможность указать минимальный баланс счета.
    public SavingsAccount(String name, long balance, long minBalanse) {
        super(name, balance);
        this.minBalanse = minBalanse;
    }
//Реализуем невозможность оплатить если баланс станет меньше минимального баланса
    @Override
    public boolean pay(long amount) {
        if (balanse - amount >= minBalanse) {
            balanse -= amount;
            return true;
        }
        return false;
    }

}
