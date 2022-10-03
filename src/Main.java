import account.Account;
import account.CheckingAccount;
import account.CreditAccount;
import account.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new CheckingAccount();
        accounts[1] = new SavingsAccount();
        accounts[2] = new CreditAccount();
        addMoney(accounts);
        pay(accounts);
        transfer(accounts);
    }

    private static void addMoney(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account.getClass().getSimpleName() + (account.addMoney(1000) ? " Пополнение прошло успешно, зачислено 1000 рублей" : " Пополненить аккаунт на 1000 рублей не получилось") + " Текущий баланс: " + account.balance());
        }

    }

    private static void pay(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account.getClass().getSimpleName() + (account.pay(500) ? " Успешно оплатили счет на 500 рублей" : " Не получилось оплатить текущий счет на 500 рублей") + " Текущий баланс: " + account.balance());
        }
    }

    private static void transfer(Account[] accounts) {
        CheckingAccount target = new CheckingAccount();
        for (Account account : accounts) {
            System.out.println(account.getClass().getSimpleName() + (account.transfer(target, 800) ? " Успешно перевели 800 рублей" : " Не смогли перевести 800 рублей") + " Текущий баланс: " + account.balance());
        }
    }
}