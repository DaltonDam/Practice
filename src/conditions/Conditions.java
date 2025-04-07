package conditions;

public class Conditions {
    public static void main(String[] args) {
        String name = "Tommy Miller";
        int age = 32;
        boolean firefly = false;
        short missions = 22;

        if(missions >= 10) {
            System.out.println(name + " está pronto para subir de cargo.");
        } else {
            System.out.println(name + " não está pronto para subir de cargo.");
        }

    }
}
