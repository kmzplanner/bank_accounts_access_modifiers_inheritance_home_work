import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Client ivan3 = new Client("Ivan", 3);

        ivan3.add(new CheckingAccount("checkingAccount", 300));
        ivan3.add(new CreditAccount("creditAccount", -300));
        ivan3.add(new SavingsAccount("SavingsAccount", 900, 500));
        ivan3.pay(400);
        ivan3.add(new SavingsAccount("SavingsAccount1", 900, 500));
        ivan3.pay(4800);

    }
}
