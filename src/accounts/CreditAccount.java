package accounts;
//Рализуем механизм наследования extends от класса Account
public class CreditAccount extends Account { //Кредитный
    public CreditAccount(String name) {
        super(name,0);
    }
//Реализуем невозможность пополнить счет, если баланс станет больше 0
    @Override
    public boolean add(long amount) {
        if (balanse + amount <= 0) {
            balanse += amount;
            return true;
        }
        return false;
    }
}
