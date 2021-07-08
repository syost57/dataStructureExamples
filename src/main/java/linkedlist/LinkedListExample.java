package linkedlist;


import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(final String[] args) {
        linkedList();
    }

  private static class Node {
        int data;
        Node next;

        Node(int d) { this.data = d; }
    }

    public static void linkedList() {

        LinkedList<Node> exampleLinkedList = new LinkedList<>();
        Node head = new Node(1);
        Node tail = new Node(2);

        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        while(StringUtils.isNotEmpty(input) ) {
            try {
                input = inputScanner.nextLine();
                if (StringUtils.equals(input, "primer")) {
                    exampleLinkedList.add(head);
                    System.out.println(exampleLinkedList.peek().data);
                }
                if (StringUtils.equals(input, "primer2")) {
                    exampleLinkedList.add(tail);
                    System.out.println(exampleLinkedList.peek().data);
                }
                if (StringUtils.equals(input, "fixPrimer2")) {
                    exampleLinkedList.getFirst().next = tail;
                    System.out.println(exampleLinkedList.peek().data);
                }
                if (StringUtils.equals(input, "check")) {
                    System.out.println(exampleLinkedList.peek().data);
                }
                if (StringUtils.equals(input, "all")) {
                    exampleLinkedList.forEach(ll -> System.out.println(ll.data));
                }
                if (StringUtils.contains(input, "add")) {
                    Node newNode = new Node(Integer.parseInt(input.split(" ")[1]));
                    exampleLinkedList.add(newNode);
                    exampleLinkedList.getLast().next = newNode;
                    exampleLinkedList.forEach(System.out::println);
                }
                if (StringUtils.equals(input, "next?")) {
                   System.out.println(exampleLinkedList.getFirst().next.data);
                }
            }catch (Exception e){
                System.out.println("Program failed for: " + e);
            }
        }
    }
}