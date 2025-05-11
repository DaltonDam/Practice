package Records;

public record CharacterRecord(String name, String email, int number) {

    public String textUpper() {
        return email.toUpperCase();
    }
}
