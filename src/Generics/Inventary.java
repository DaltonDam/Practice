package Generics;

public class Inventary {
    private String name;

    public Inventary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inventary" + name;
    }
}
