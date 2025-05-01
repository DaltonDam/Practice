package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array sao estaticos, nao alteram de tamanho
        List<String> list = new ArrayList<>();
        list.add("Strelok");
        list.add("Scar");
        list.add("Stalker");
        list.remove(2);
        System.out.println(list);

         int element = 0;
         String name = "Troca";
         list.set(element, name);

        System.out.println(list.size());


    }
}
