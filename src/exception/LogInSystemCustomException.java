package exception;

public class LogInSystemCustomException  {
    private String CorrectPass = "12345";
    public void login( String Password) throws InvalidLogInCustomException {

        if (!Password.equals(CorrectPass)){
            throw new InvalidLogInCustomException("Incorrect password..!  /n Please enter valid password..!");
        } else {
            System.out.println("LogIn Successful..");
        }

    }
    public static void main(String[] args) {
        LogInSystemCustomException LoginSystem = new LogInSystemCustomException();

        try {
            LoginSystem.login("wrong Password ");

        }catch(InvalidLogInCustomException i){
            i.printStackTrace();
        }

        try{
            LoginSystem.login("12345");

        }catch(InvalidLogInCustomException i){

        }

    }
}
