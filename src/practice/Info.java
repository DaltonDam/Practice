package practice;

public record Info(String name, int id) {

    public String nameUppercase() {
        return name.toUpperCase();
    }

}
