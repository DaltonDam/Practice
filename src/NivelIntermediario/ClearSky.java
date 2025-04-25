package NivelIntermediario;

public class ClearSky extends Person implements Artifact {

    public void welcome() {
        System.out.println("I'm from the Clear Sky faction");
    }

    @Override
    public void ArtifactEnable() {
        System.out.println(name + "is using the artifact.");
    }

    @Override
    public void sobrecarga() {

    }

    @Override
    public void sobrecarga(int num) {

    }
}
