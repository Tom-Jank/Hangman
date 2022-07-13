public class Session {
    protected static void initializeAndManageSession() {
        gameLogic player = new gameLogic();
        String buzzword = fileHandler.selectRandomBuzzword();
        String mappedBuzzword = TUI.returnMappedBuzzword(buzzword);
        while(true) {
            System.out.println(mappedBuzzword);
            char answer = TUI.gameMenu();
            boolean isUserCorrect = gameLogic.checkIfPlayerIsCorrect(buzzword,answer);
            if(!isUserCorrect){
                player.playerLifeCounter -= 1;
                if(player.playerLifeCounter == 0) player.isStillPlaying = false;
            }
            else {
                mappedBuzzword = gameLogic.updatePlayerProgress(buzzword,answer,mappedBuzzword);
                if(gameLogic.checkPlayerProgress(mappedBuzzword) == true) {
                    TUI.resultInformationIfWon();
                    break;
                }
            }
            if(!player.isStillPlaying){
                TUI.resultInformationIfLost();
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
