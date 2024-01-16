package OOPS.AbstractClasses.Interface;

public class AxisBank implements BankAPI{
    @Override
    public int getBalance(int accNumber) {
        return 0;
    }

    @Override
    public void transferAmount(int fromMobile, int toMobile, int amount) {

    }
}
