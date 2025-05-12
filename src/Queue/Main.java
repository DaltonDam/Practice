package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.poll();

        System.out.println("Fila: " + queue);
        queue.peek();

        String condition = queue.isEmpty() ? "Está vazia" : "Não está vazia";
        System.out.println(queue.isEmpty());
        System.out.println(condition);



    }
}
