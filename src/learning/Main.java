package learning;

public class Main {
    public static void main(String[] args) {
        String name = "Gene";
        int age = 23;
        char initial = 'G';
        double height = 1.81;
        boolean live = true;
        Long money = 999999L;

        char c = 'c';
        Long l = 1000000000000L;

        String nameUpperCase = name.toUpperCase();
        System.out.println("Nome em caixa alta: " + nameUpperCase);

        System.out.println("Nome padrão: " + name);

        String nameLowerCase = name.toLowerCase();
        System.out.println("Nome em caixa baixa: " + nameLowerCase);


    }
}
