package Generics;

public class Main {
    public static void main(String[] args) {

        Backpack<Object> backpack = new Backpack<>();
        backpack.addObjects(new Weapon("AK47"));
        backpack.addObjects(new Drink("Water"));

        backpack.forI();




    }
}
