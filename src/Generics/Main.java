package Generics;

public class Main {
    public static void main(String[] args) {

        Inventary pen = new Inventary("Pen");
        Inventary notebook = new Inventary("Notebook");
        Inventary candy = new Inventary("Candy");

        Backpack<Inventary> backpack = new Backpack<>();
        backpack.addObjects(pen);
        backpack.addObjects(notebook);
        backpack.addObjects(candy);

        System.out.println(backpack.toString());




    }
}
