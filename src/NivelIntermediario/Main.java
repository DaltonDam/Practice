package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Stalker strelok = new Stalker();
        strelok.name = "Strelok";
        strelok.age = 30;

        Stalker scar = new Stalker("Scar",30,"Swamp",10,Rank.ROOKIE);

        System.out.println(strelok.toString());

        Monolith monolith = new Monolith();
        monolith.name = "Monolith soldier";
        monolith.Monolith();
        System.out.println(monolith.toString());

    }
}
