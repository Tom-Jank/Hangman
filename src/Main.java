public class Main {
    public static void main(String[] args) {
        fileHandler.createHangmanWordDatabase();
        fileHandler.writeBuzzwordToDatabase();
        String buzzword = fileHandler.selectRandomBuzzword();
        System.out.println(TUI.returnMappedBuzzword(buzzword));
    }
}