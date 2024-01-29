package clients;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {

    protected String name;
    protected int maxCountAccount;// Максимальное количество счетов
    protected Account[] accounts; //Реализован полиморфизм принимает наследников класса Account

    public Client(String name, int maxCountAccount) {
        this.name = name;
        this.maxCountAccount = maxCountAccount;
        accounts = new Account[maxCountAccount];
    }
//Реализуем возможность добавлять счета в количестве не больше максимального количества счетов
    public void add(Account account) { //Реализован полиморфизм принимает наследников класса Account
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        // Если в массиве не осталось ячеек с значение null, значит все ячейки заполнены, иначе бы уже ушли из for
        System.out.println("Мест для добавления нового счёта нет! :(");
    }
//Реализуем возможность поиска счета с возможностью оплаты
    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].pay(amount)) {
                accounts[i].pay(amount);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for(int i = 0; i < accounts.length && accounts[i] != null; i++){
            if(accounts[i].add(money)){
                return true;
            }
        }
        System.out.println("Деньги не приняты");
        return false;
    }
}
