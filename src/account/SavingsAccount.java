package account;

public class SavingsAccount extends Account {
    @Override
    public boolean pay(int amount) {
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        money += amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (money < amount) return false;
        final boolean result = account.addMoney(amount);
        if (result) money -= amount;
        return result;
    }
}
