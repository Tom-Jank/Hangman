public class Session {
    protected static void initializeAndManageSession() {
        //Initialize new player
        gameLogic player = new gameLogic();
        //Select a word from DB and create a hidden version of it
        String buzzword = fileHandler.selectRandomBuzzword();
        String mappedBuzzword = TUI.returnMappedBuzzword(buzzword);
        while(true) {
            //Show player hidden version of a buzzword and ask for an answer
            System.out.println(mappedBuzzword);
            char answer = TUI.gameMenu();
            boolean isUserCorrect = gameLogic.checkIfPlayerIsCorrect(buzzword,answer);
            //Draw HANGMAN and reduce life points if not correct. Check if player has any lives left
            if(!isUserCorrect){
                TUI.drawHangmanPic(player.playerLifeCounter);
                player.playerLifeCounter -= 1;
                if(player.playerLifeCounter == 0) {
                    player.isStillPlaying = false;
                    TUI.resultInformationIfLost();
                    break;
                }
            }
            //Update hidden buzzword and chceck if user has won or keeps playing
            else {
                mappedBuzzword = gameLogic.updatePlayerProgress(buzzword,answer,mappedBuzzword);
                if(gameLogic.checkPlayerProgress(mappedBuzzword)) {
                    TUI.resultInformationIfWon();
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
