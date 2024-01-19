package OOPS.Exception;

public class Test{

    private void getOrder(int orderId) throws OrderNotfoundException {
        if(orderId == 101){
            throw new OrderNotfoundException("Oder not found for id: "+orderId);
        }else {

        }
    }
    public static void main(String[] args) throws OrderNotfoundException {
        Test test = new Test();
        test.getOrder(101);
    }


}
