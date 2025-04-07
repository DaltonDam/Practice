package conditions;

import java.util.ArrayList;
import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do personagem: ");
        String name = scanner.nextLine();

        System.out.println("Insira a idade do personagem: ");
        int age = scanner.nextInt();

        System.out.println("Escolha uma missão para o Personagem");
        int choice = scanner.nextInt();

        System.out.println(scanner.toString());

        if(age>=18) {
            System.out.println("O personagem é de maior e está pronto para explorar");
        } else {
            System.out.println("O personagem é de menor, precisa ficar mais tempo em casa");
        }

    }
}
