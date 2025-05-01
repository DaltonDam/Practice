package NivelIntermediario;

public class Missao {
    private String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + "Rank: " + rank + "Descrição: " + rank.getDescription());
    }

    public Missao(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
