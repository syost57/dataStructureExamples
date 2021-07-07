package stacks;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(final String[] args) {
        stack();
    }

    public static void stack() {

        Stack<String> exampleStack = new Stack<>();
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        while(StringUtils.isNotEmpty(input) ) {
            try {
                input = inputScanner.nextLine();
                if (StringUtils.equals(input, "check")) {
                    System.out.println("Current head: " + exampleStack.peek());
                }
                if (StringUtils.contains(input, "push")) {
                    exampleStack.push(input.split(" ")[1]);
                }
                if (StringUtils.equals(input, "pop")) {
                    exampleStack.pop();
                }
            }catch (Exception e){
                System.out.println("Program failed for: " + e);
            }
        }
    }
}