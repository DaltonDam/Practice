package NivelIntermediario.construtores;

import NivelIntermediario.Rank;

public class Missao {
    private String nome;
    private Rank rank;

    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + "Rank: " + rank);
    }

    public Missao(String nome, Rank rank) {
        this.nome = nome;
        this.rank = rank;
    }
}
