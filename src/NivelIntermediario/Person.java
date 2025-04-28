package NivelIntermediario;

public abstract class Person implements Strategy{

    //TODO: adicionar dois novos atributos: rank e tasks

    private String name;
    private int age;
    private String location;
    private int tasks;
    private Rank rank;
    private final int id = 0;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTasks() {
        return tasks;
    }

    public void setTasks(int tasks) {
        this.tasks = tasks;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    final void throwGrenade() {
        System.out.println("Grenade!!!");
    }

    public Person() {
    }

    public Person(String name, int age, String location, int tasks, Rank rank) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.tasks = tasks;
        this.rank = rank;
    }

    //TODO: Sobrecarga de construtor



    public void attack() {
        System.out.println(getName() + " is attacking!");
    }

    @Override
    public void strategy() {
        System.out.println("This is my strategy!");
    }

    public String WelcomeStalker() {
        return "Welcome, " + getName();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", tasks=" + tasks +
                ", rank=" + rank +
                ", id=" + id +
                '}';
    }
}
