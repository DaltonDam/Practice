package NivelIntermediario;

public enum RankDeMissoes {
    A("Easy", 3),
    B("Normal",6),
    C("Hard",10);

    private String description;
    private int difficult;

    RankDeMissoes(String description, int difficult) {
        this.description = description;
        this.difficult = difficult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }
}
