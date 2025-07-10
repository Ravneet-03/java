package exception;

public class ArrayExceptionExample {

    public static void main(String[] args) {
        try{
            int[] arr ={1,2,3};
            System.out.println( arr[5]);
            }catch (Exception e){
            e.printStackTrace();
        }
    }
}
