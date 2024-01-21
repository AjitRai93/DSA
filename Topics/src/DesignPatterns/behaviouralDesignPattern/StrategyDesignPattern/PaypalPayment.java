package DesignPatterns.behaviouralDesignPattern.StrategyDesignPattern;

public class PaypalPayment implements PaymentStrategy{

    private String emailId;
    private String password;

    public PaypalPayment(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+"rs is paid using PayPal");
    }
}
