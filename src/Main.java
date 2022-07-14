
public class Main {
    public static void main(String[] args) {
        //Create game DB BEFORE infinite while loop
        fileHandler.createHangmanWordDatabase();
        while(true) {
            char decision = TUI.userMainUI();
            switch(decision) {
                case '1':
                    Session.initializeAndManageSession();
                    break;
                case '2':
                    fileHandler.writeBuzzwordToDatabase();
                    break;
                default:
                    break;
            }
        }
    }
}