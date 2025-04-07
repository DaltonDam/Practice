package NivelIntermediario;

public abstract class Person {
    String name;
    int age;
    String location;
    int minAge = 18;

    public void attack() {
        System.out.println(name + " is attacking!");
    }

    public String WelcomeStalker() {
        return "Welcome, " + name;
    }

    public int ageForStalker(int minAgeForStalker) {
        return minAge - minAgeForStalker;
    }

}
