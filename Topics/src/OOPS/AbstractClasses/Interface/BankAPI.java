package OOPS.AbstractClasses.Interface;

public interface BankAPI {
    int getBalance(int accNumber);
    void transferAmount(int fromMobile, int toMobile, int amount);
}
