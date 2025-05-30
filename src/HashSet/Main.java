package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Joel");
        list.add("Ellie");
        list.add("Tommy");
        list.add("Joel");

        //Serve para ignorar itens duplicados, não tem ordem
        Set<String> set = new HashSet<>();
        set.addAll(list);
        set.remove("Tommy");

        System.out.println(set);

        //Tem também o LinkedHashSet: ele coloca na ordem de implementação do código
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);

        System.out.println(treeSet);


    }
}
