package stringExample;

public class CountsWordString {
    public static void main(String[] args) {

        String input = "Java is fun ";
      // trim: it is used for removing the first  and last blank space of the string ;


      // split : it is used for converting the string into  the substring of an array like
        // "java"
        //"is"
        // "fun"



        String[] words = input.trim().split(" ");


         int Count = words.length;
        System.out.println("Counts of words: " + Count);
    }
}
