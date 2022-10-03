package account;

public class CreditAccount extends Account {
    @Override
    public boolean pay(int amount) {
        money -= amount;
        return true;
    }

    @Override
    public boolean addMoney(int amount) {
        if (money + amount > 0) return false;
        money += amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        final boolean result = account.addMoney(amount);
        if (result) money -= amount;
        return result;
    }
}
