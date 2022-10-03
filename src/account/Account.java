package account;

public abstract class Account {
    protected int money;

    public abstract boolean pay(int amount);

    public abstract boolean addMoney(int amount);

    public abstract boolean transfer(Account account, int amount);

    public int balance() {
        return money;
    }
}
