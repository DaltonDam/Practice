package Records;

public class Main {
    public static void main(String[] args) {

        Character Niko = new Character("Niko Bellic", "nikob@email.com", 999999999);

        CharacterRecord record = new CharacterRecord("Record", "record@email.com", 88888888);
        record.textUpper();

        System.out.println(record);

    }
}
