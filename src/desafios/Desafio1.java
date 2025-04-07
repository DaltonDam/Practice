package desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String description1 = "Defender a Aldeia da Folha";
        String description2 = "Buscar o pergaminho";
        String description3 = "Derrotar Zabuza";

        char difficult1 = 'A';
        char difficult2 = 'B';
        char difficult3 = 'C';
        char difficult4 = 'D';
        String status1 = "Concluída";
        String status2 = "Não concluída";

        //Determinar a dificuldade da missão que será printada:
        char missionDifficult = difficult1;

        //Missões com suas determinadas descrições + dificuldadde definida anteriormente
        String mission1 = description1 + "\nNível de dificuldade: " + missionDifficult;
        String mission2 = description2 + "\nNível de dificuldade: " + missionDifficult;
        String mission3 = description3 + "\nNível de dificuldade: " + missionDifficult;


        //Ninjas
        String ninjaName1 = "Naruto Uzumaki";
        int ninjaAge1 = 14;

        String ninjaName2 = "Kakashi Hatake";
        int ninjaAge2 = 30;

        String ninjaName3 = "Rock Lee";
        int ninjaAge3 = 15;

        //Midificar: "ninjaAge1","ninjaName1" e "mission2" do if and else, caso queira printar outro ninja e/ou outra missão
        if(ninjaAge1<15 && (missionDifficult==difficult3 || missionDifficult==difficult4)) {
            System.out.println(ninjaName1+ " deve esperar um pouco mais para fazer esta missão! \nMissão: " + mission2 + "\nStatus: " + status2);
        } else {
            System.out.println(ninjaName1+ " concluiu com sucesso esta missão! \nMissão: " + mission2 + "\nStatus: " + status1);
        }



    }
}
