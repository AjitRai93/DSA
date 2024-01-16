package OOPS.AbstractClasses.Interface;

public class IciciBank implements BankAPI{
    @Override
    public int getBalance(int accNumber) {
        return 200;
    }

    @Override
    public void transferAmount(int fromMobile, int toMobile, int amount) {

    }
}
