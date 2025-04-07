package conditions;

public class ternarios {
    public static void main(String[] args) {
        short numberOfMissions = 11;
        String characterLevel = (numberOfMissions>=10) ? "Ele tem 10 ou mais missões" : "Ele tem menos de 10 missões, portanto, não está preparado";
        System.out.println(characterLevel);


        int numero = 15;
        String ternario = (numero>=10) ? "if" : "else";


    }
}
