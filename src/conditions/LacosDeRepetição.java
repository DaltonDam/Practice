package conditions;

public class LacosDeRepetição {
    public static void main(String[] args) {
        int numberOfZombies = 0;
        int maxNumberOfZombies = 40;

//        while (numberOfZombies <= maxNumberOfZombies) {
//            numberOfZombies++;
//            System.out.println("The survivor is defender the position " + numberOfZombies);
//            if (numberOfZombies==41) {
//                System.out.println("The survivor was forced to retreat");
//            }
//        }

        for (int i = 0; i <= maxNumberOfZombies; i++) {
            System.out.println("The survivor is defender the position " + i);
        }



    }
}
