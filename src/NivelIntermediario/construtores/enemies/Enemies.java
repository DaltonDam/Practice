package NivelIntermediario.construtores.enemies;

public abstract class Enemies {
    String name;
    int age;
    boolean liveOrNot;
    String location;
    double money;
    double height;

    public abstract void group();

    public Enemies(){
    }

    public Enemies(String name, int age, boolean liveOrNot, String location, double money, double height) {
        this.name = name;
        this.age = age;
        this.liveOrNot = liveOrNot;
        this.location = location;
        this.money = money;
        this.height = height;
    }

    public Enemies(String name, int age, boolean liveOrNot, String location) {
        this.name = name;
        this.age = age;
        this.liveOrNot = liveOrNot;
        this.location = location;
    }

    public Enemies(String name, int age, boolean liveOrNot) {
        this.name = name;
        this.age = age;
        this.liveOrNot = liveOrNot;
    }
}
