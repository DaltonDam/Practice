package NivelIntermediario;

public class ClearSky extends Person implements Artifact {

    public ClearSky() {
    }

    public ClearSky(String name, int age, String location, int tasks, Rank rank) {
        super(name, age, location, tasks, rank);
    }

    public void welcome() {
        System.out.println("I'm from the Clear Sky faction");
    }

    @Override
    public void ArtifactEnable() {
        System.out.println(getName() + "is using the artifact.");
    }

    @Override
    public void sobrecarga() {

    }

    @Override
    public void sobrecarga(int num) {

    }
}
