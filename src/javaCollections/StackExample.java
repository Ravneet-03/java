package javaCollections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("JAVA");
        stack.push("Python");
        stack.push("JavaScript");
        stack.push("C Language");
        stack.push("C++");
        stack.push("PHP");


            System.out.println("Stack Elements : " + stack); // All Items Print

            System.out.println("Popped Element : " + stack.pop()); //PHP

            System.out.println("Top Element : " + stack.peek()); // C++

           System.out.println("Searching Element : " + stack.search("JAVA"));
       for (String str : stack){
            System.out.println("Stack items after POP : " + str);
        }
    }
}
