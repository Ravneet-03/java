package exception;

public class LowBalanceCustomExceptionExample {
    public static void main(String[] args)  throws BankCustomExceptionExample{

        int balance = 1000;
        int withdraw = 800;

        try{
            if(withdraw > balance){
             throw new  BankCustomExceptionExample("Insufficent balance for Withdrawl");
            }else {
                balance -= withdraw;
                System.out.println(" withdraw Successful. Remaining balance is :" + balance);
            }
        }
        catch (BankCustomExceptionExample b){
            b.printStackTrace();
        }
    }
}
