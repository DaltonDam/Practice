package Records;

public class Character {
    private final String name;
    private final String email;
    private final int number;

    public Character(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.number = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }
}
