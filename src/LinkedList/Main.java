package LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //ArrayList e Linked são classes que implementam a collection
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        //Queue é interface
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


        linkedList.add("Water");
        linkedList.add("Soda");
        linkedList.add("Juice");

        /*
        Array normal não implementa nada,
        caso tente printar assim, vai printar a refecencia de memoria
        */
        System.out.println(linkedList);




    }
}
