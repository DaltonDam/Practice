package desafios.Desafio6;

import java.util.LinkedList;

public class Ninjas {

    private LinkedList<Ninja> ninjas;

    public Ninjas() {
        this.ninjas = new LinkedList<>();
    }

    public void adicionarNinja(Ninja ninja) {
        ninjas.add(ninja);
    }

    public void tamanhoDaLista() {
        System.out.println("A lista possui " +ninjas.size() + " elementos.");
    }

    public void exibirNinjaPorIndice(int indice) {
        if (indice < 0 || indice >= ninjas.size()) {
            System.out.println("Índice inválido.");
        } else if(ninjas.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println(ninjas.get(indice));
        }
    }

    public void exibirNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        } else {
            System.out.println(ninjas);
        }
    }

    public void adicionarNoInicio(Ninja ninja) {
        ninjas.addFirst(ninja);
    }

    public void removerPrimeiroNinja() {
        if (ninjas.isEmpty()) {
            System.out.println("Não há ninja na lista para remover!");
        } else {
            ninjas.removeFirst();
        }
    }

}
