package Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Model> characters = new ArrayList<>();
        characters.add(new Model("Niko Bellic","Liberty City", 32));
        characters.add(new Model("Michael de Santa","Los Santos", 42));
        characters.add(new Model("Carl Jhonson","Los Santos", 25));
        characters.add(new Model("Jason Duval","Vice City", 26));

//        characters.stream()
//                .filter(character -> character.getLocation().equals("Los Santos"))
//                .forEach(System.out::println);


//        characters.stream()
//                .sorted((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()))
//                .forEach(System.out::println);


        characters.stream()
                .sorted((n1, n2) -> n1.getName().compareTo(n2.getName()))
                .forEach(System.out::println);

    }
}
