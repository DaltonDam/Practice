package desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu  = true;
        String ninja[] = new String[3];
        int counter = 0;
        int list = 0;

        while (menu) {
            System.out.println("1. Cadastrar um novo ninja");
            System.out.println("2. Remover um ninja pelo índice");
            System.out.println("3. Listar ninjas");
            System.out.println("4. Sair do programa");

            int condition = scanner.nextInt();

            scanner.nextLine();
            switch (condition) {
                case 1:
                    System.out.println("Nome do ninja: ");
                    String name = scanner.nextLine();
                    ninja[counter] = name;
                    System.out.println(name + " foi adicionado.");
                    counter ++;
                    break;

                case 2:
                    System.out.println("Digite um número de 0 a 9 para remover um Ninja: ");
                    int response = scanner.nextInt();
                    System.out.println(ninja[response] + "Foi removido.");
                    ninja[response] = null;
                    counter--;
                    break;

                case 3:
                    for (int i = 0; i < ninja.length; i++) {
                        System.out.println("Ninjas cadastrados: " + ninja[i]);
                    }
                    break;
                case 4:
                    System.out.println("Finalizando...");
                    menu = false;
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }

        scanner.close();
    }
}
