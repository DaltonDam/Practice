package desafios.desafio3;

public class Desafio3 {
    public static void main(String[] args) {
        Stalker strelok = new Stalker();
        strelok.name = "Strelok";
        strelok.age = 30;
        strelok.difficulty ="Hard";
        strelok.artifact = "Moonlight";
        strelok.mission = "Find the Strelok.";
        strelok.missionStatus = "Not completed.";

        String print = strelok.showInfo();
        System.out.println(print);
        strelok.showArtifact();


    }
}
