package desafios.desafio3;

public class Stalker extends Person{
    String artifact;

    public void showArtifact() {
        System.out.println(name + " is using the " + artifact + " artifact.");

    }

    @Override
    public String showInfo() {
        return "Info\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nArtifact: " + artifact +
                "\nMission:\n   " + mission +
                "\n   Difficulty: " + difficulty +
                "\n   Status: " + missionStatus;
    }

    @Override
    public void attack() {
        System.out.println(name + "is shooting");
    }
}
