package OOPS.Interface;

public class PhonePay {
    BankAPI bankAPI;

    public PhonePay(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public int checkBalance(int accNo){
        int balance = bankAPI.getBalance(accNo);
        return balance;
    }
}
