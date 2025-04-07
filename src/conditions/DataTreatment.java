package conditions;

import java.util.Scanner;

public class DataTreatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Strelok");
        System.out.println("2 - Joel");
        System.out.println("3 - Kratos");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Você escolheu o Strelok, e ele está a caminho do centro da Zona.");
                break;
            case 2:
                System.out.println("Você escolheu o Joel, e ele está procurando por Ellie.");
                break;
            case 3:
                System.out.println("Você escolheu o Kratos, e ele está subindo o monte Olimpo.");
                break;
            default:
                System.out.println("Escolha inválida, somente um número entre 1 a 3!");
        }

    }
}
