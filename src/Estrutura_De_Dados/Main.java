package Estrutura_De_Dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Arrays: São estáticos
        System.out.println("\n--------------- Array ---------------\n");
        String[] array = new String[3];
        array[0] = "Niko Bellic";
        array[1] = "Strelok";
        array[2] = "Kratos";

        System.out.println("Array reference: " + array);
        System.out.println("Array element [0]: " + array[0]);
        for (String obj : array) {
            System.out.println(obj);
        }

        //List: Dinâmicas, aumentam e diminuem conforme necessário
        System.out.println("\n--------------- List ---------------\n");
        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Franklin");
        list.add("Trevor");
        list.remove(1);
        System.out.println("List: " + list);

        //Stack: Pilha, o último a entrar é o primeiro a sair
        System.out.println("\n--------------- List ---------------\n");
        Stack<String> stack = new Stack<>();
        stack.push("CJ");
        stack.push("Scar");
        stack.push("Cloud Strife");
        stack.pop();
        stack.peek();
        System.out.println("Stack: " + stack);

    }
}
