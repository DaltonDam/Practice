package NivelIntermediario;

public class Stalker extends Person implements Artifact, PDA{

    public Stalker() {
        super();
    }

    public Stalker(String name, int age, String location) {
        super(name, age, location);
    }

    //Sobrecarga
    public Stalker(String name, int age, String location, int tasks, Rank rank) {
        super(name, age, location, tasks, rank);
    }

    public void strategy() {
        System.out.println("I am a Stalker, and that's my strategy!");
    }

    @Override
    public void ArtifactEnable() {
        System.out.println(name + " is using the artifact.");
    }

    @Override
    public void openPDA() {
        System.out.println(name + " open PDA.");
    }

    @Override
    public void sobrecarga() {
        System.out.println(name + " sobrecarregou um método");
    }


    @Override
    public void sobrecarga(int num) {
        if(num > 50) {
            System.out.println("yes");
        } else {
            System.out.println("pqp");
        }
    }

}
