package queue;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class QueueExample {
    public static void main(final String[] args) {
        queue();
    }

    public static void queue() {

        Queue<String> exampleQueue = new PriorityQueue<String>();
        exampleQueue.addAll( Arrays.asList("Hel", "Thor", "Loki", "Odin", "Freyja"));

        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        while(StringUtils.isNotEmpty(input) ) {
            try {
                input = inputScanner.nextLine();
                if (StringUtils.equals(input, "check")) {
                    System.out.println(exampleQueue.peek());
                }
                if (StringUtils.equals(input, "all")) {
                    exampleQueue.forEach(System.out::println);
                }
                if (StringUtils.contains(input, "enqueue")) {
                    exampleQueue.add(input.split(" ")[1]);
                    exampleQueue.forEach(System.out::println);
                }
                if (StringUtils.equals(input, "dequeue")) {
                    exampleQueue.poll();
                    exampleQueue.forEach(System.out::println);
                }
            }catch (Exception e){
                System.out.println("Program failed for: " + e);
            }
        }
    }
}