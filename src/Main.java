
public class Main {
    public static void main(String[] args) {
        //Create game DB BEFORE infinite while loop
        fileHandler.createHangmanWordDatabase();
        //noinspection InfiniteLoopStatement
        while(true) {
            char decision = TUI.userMainUI();
            switch (decision) {
                case '1' -> Session.initializeAndManageSession();
                case '2' -> fileHandler.writeBuzzwordToDatabase();
                default -> {
                }
            }
        }
    }
}