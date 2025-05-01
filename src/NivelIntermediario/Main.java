package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------- Strelok ---------------------");
        Person strelok = new Stalker("Strelok", 30, "Cordon", 21, Rank.EXPERT);

        System.out.println(strelok.getName());

        Missao missao1 = new Missao("Resgatar cachorro", RankDeMissoes.B);


    }
}
