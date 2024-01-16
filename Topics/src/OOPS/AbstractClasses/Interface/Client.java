package OOPS.AbstractClasses.Interface;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = new AxisBank();
        PhonePay phonePay = new PhonePay(bankAPI);
        phonePay.checkBalance(20);
    }
}
