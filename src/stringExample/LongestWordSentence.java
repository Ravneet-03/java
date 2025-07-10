package stringExample;

public class LongestWordSentence {
    public static void main(String[] args) {

        String str = "java is very Powerful";
        String [] word = str.split(" ");

        String result = "";

        for (int i =0 ; i < word.length;i++){
            if (word[i].length()> result.length()){
                result=word[i];
            }
        }
            System.out.println("longest word :"+ result);
    }
}
