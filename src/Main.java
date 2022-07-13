
public class Main {
    public static void main(String[] args) {
        while(true) {
            char decision = TUI.userMainUI();
            switch(decision) {
                case '1':
                    while(true) {
                        gameLogic player = new gameLogic();
                        TUI.gameMenu();
                        String mappedBuzzword = TUI.returnMappedBuzzword(fileHandler.selectRandomBuzzword());
                        System.out.println(mappedBuzzword);
                        if(!player.isStillPlaying) break;
                    }
                case '2':
                    fileHandler.writeBuzzwordToDatabase();
                    break;
                default:
                    break;
            }
        }
    }
}