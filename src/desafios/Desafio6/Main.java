package desafios.Desafio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean onOff = true;

        Ninjas listaNinja = new Ninjas();
//        Ninja naruto = new Ninja("Naruto Uzumaki",18,"Aldeia da Folha");
        listaNinja.adicionarNinja(new Ninja("Naruto Uzumaki",16,"Vila da Folha"));
        listaNinja.adicionarNinja(new Ninja("Sasuke Uchiha",16,"Vila da Folha"));
        listaNinja.adicionarNinja(new Ninja("Sakura Haruno",16,"Vila da Folha"));
        listaNinja.adicionarNinja(new Ninja("Kakashi Hatake",29,"Vila da Folha"));
        listaNinja.adicionarNinja(new Ninja("Gaara",16,"Vila da Areia"));
        listaNinja.adicionarNinja(new Ninja("Rock Lee",16,"Vila da Folha"));
        listaNinja.adicionarNinja(new Ninja("Temari",18,"Vila da Areia"));

        while (onOff) {
            System.out.println("----------------- Menu -----------------");
            System.out.println("Digite: ");
            System.out.println("1. Para remover o primeiro ninja.\n" +
                    "2. Para adicionar um novo ninja no início da lista.\n" +
                    "3. Para exibir a lista.\n" +
                    "4. Para acessar um ninja específico.\n" +
                    "0. Para sair do programa.");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    listaNinja.removerPrimeiroNinja();
                    System.out.println("Primeiro ninja da lista foi removido.");
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Vila: ");
                    String vila = scanner.nextLine();

                    listaNinja.adicionarNoInicio(new Ninja(nome,idade,vila));

                    break;

                case 3:
                    listaNinja.exibirNinjas();
                    break;

                case 4:
                    listaNinja.tamanhoDaLista();
                    System.out.println("O índice dos elementos começa em 0.");
                    System.out.println("Digite o índice que deseja buscar: ");
                    int indice = scanner.nextInt();

                    listaNinja.exibirNinjaPorIndice(indice);
                    break;

                case 0:
                    onOff = false;
                    break;

                default:
                    System.out.println("Tente novamente com um número válido.");
            }

        }

        scanner.close();

    }
}
