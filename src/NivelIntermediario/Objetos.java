package NivelIntermediario;

public class Objetos {
    public static void main(String[] args) {

        Stalker strelok = new Stalker();
        strelok.name = "Strelok";
        strelok.age = 35;
        strelok.location = "Zone";

        strelok.attack();
        String print = strelok.WelcomeStalker();
        System.out.println(strelok.WelcomeStalker());
        System.out.println(print);

        int time = strelok.ageForStalker(21);
        if(time>0) {
            System.out.println(time);
        } else {
            System.out.println("Tem idade suficiente para ser um Stalker");
        }

    }
}
