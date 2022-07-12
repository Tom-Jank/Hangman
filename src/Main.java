public class Main {
    public static void main(String[] args) {
        fileHandler.createHangmanWordDatabase();
        fileHandler.writeBuzzwordToDatabase();
        System.out.println(fileHandler.selectRandomBuzzword());
    }
}