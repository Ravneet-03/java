package stringExample;

public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String input= "simmaarr";
        String output = "";

        for(int i =0; i<input.length(); i++) {
            char ch = input.charAt(i);

            if (output.indexOf(ch) == -1) {
                output = output + ch;
            }
        }
        System.out.println(" Output is :" + output);



    }
}
