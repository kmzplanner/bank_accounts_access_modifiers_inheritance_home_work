package clients;

import accounts.Account;

public class Client {

    protected String name;
    protected int maxCountAccount;
    protected Account[] accounts; // Полиморфизм принимает наследников класса Account

    public Client(String name, int maxCountAccount) {
        this.name = name;
        this.maxCountAccount = maxCountAccount;
        accounts = new Account[maxCountAccount];
    }

    public void add(Account account) { // Полиморфизм принимает наследников класса Account
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        // если дошли сюда, значит не нашлось свободной ячейки, иначе бы уже ушли из for
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].pay(amount)) {
                accounts[i].pay(amount);
                return true;
            }
        }
        return false;
    }
}
