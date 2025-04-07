package desafios.desafio3;

public class Person {
    String name;
    int age;
    String mission;
    String difficulty;
    String missionStatus;

    public String showInfo() {
        return "Info\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nMission:   " + mission +
                "\n   Difficulty: " + difficulty +
                "\n   Status: " + missionStatus;
    }

    public void attack() {
        System.out.println(name + " is attacking!");
    }
}
