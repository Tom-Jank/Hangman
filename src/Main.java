
public class Main {
    public static void main(String[] args) {
        while(true) {
            char decision = TUI.userMainUI();
            switch(decision) {
                case '1':
                    gameLogic player = new gameLogic();
                    String buzzword = fileHandler.selectRandomBuzzword();
                    String mappedBuzzword = TUI.returnMappedBuzzword(buzzword);
                    while(true) {
                        System.out.println(mappedBuzzword);
                        char answer = TUI.gameMenu();
                        boolean isUserCorrect = gameLogic.checkIfPlayerIsCorrect(buzzword,answer);
                        if(!isUserCorrect) player.playerLifeCounter -= 1;
                        else {
                            mappedBuzzword = gameLogic.updatePlayerProgress(buzzword,answer,mappedBuzzword);
                        }
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