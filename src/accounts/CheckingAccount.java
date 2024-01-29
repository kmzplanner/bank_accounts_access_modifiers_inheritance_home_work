package accounts;
//Рализуем механизм наследования extends от класса Account
public class CheckingAccount extends Account { //Рассчетный
    public CheckingAccount(String name, long balanse) {
        super(name, balanse);
    }
// Реалезуем невозможность оплаты если баланс станет меньше 0
    @Override
    public boolean pay(long amount) {
        if (balanse - amount >= 0) {
            balanse -= amount;
            return true;
        }
        return false;
    }

}

