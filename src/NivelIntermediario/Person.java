package NivelIntermediario;

public abstract class Person implements Strategy{

    //TODO: adicionar dois novos atributos: rank e tasks

    String name;
    int age;
    String location;
    //int minAge = 18;
    int tasks;
    Rank rank;
    final int id = 0;


    final void throwGrenade() {
        System.out.println("Grenade!!!");
    }

    public Person() {
    }

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    //TODO: Sobrecarga de construtor

    public Person(String name, int age, String location, int tasks, Rank rank) {
        this(name, age, location); //Redundância
        this.tasks = tasks;
        this.rank = rank;
    }

    public void attack() {
        System.out.println(name + " is attacking!");
    }

    @Override
    public void strategy() {
        System.out.println("This is my strategy!");
    }

    public String WelcomeStalker() {
        return "Welcome, " + name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Location: '" + location + "\n" +
                "Tasks: " + tasks + "\n" +
                "Rank: " + rank;
    }
}
