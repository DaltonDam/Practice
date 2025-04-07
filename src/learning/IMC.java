package learning;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Insira a sua altura: ");
        double altura = scanner.nextDouble();

        double resultado = peso / (altura*altura);

        if (resultado < 18.5) {
            System.out.println("Seu IMC é " + resultado + ", e tu tá só o osso");
        } else if(resultado >=18.5 && resultado < 24.9) {
            System.out.println("Seu IMC é " + resultado + ", e tu tá de boa");
        } else if(resultado > 24.9 && resultado < 29.9) {
            System.out.println("Seu IMC é " + resultado + ", e tu tá meio buchudo");
        } else {
            System.out.println("Seu IMC é " + resultado + ", e tu é a próxima Taís carla");
        }


    }
}
