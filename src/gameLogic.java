public class gameLogic {
    public boolean isStillPlaying;
    public int playerLifeCounter;
    public gameLogic() {
        playerLifeCounter = 7;
        isStillPlaying = true;
    }
    protected static boolean checkIfPlayerIsCorrect(String buzzword, char userInput) {
        if(buzzword.indexOf(userInput) < 0) return false;
        else return true;
    }
    protected static String updatePlayerProgress(String buzzword, char userInput, String mappedBuzzword) {
        if (buzzword.indexOf(userInput) != -1) {
            int index = buzzword.indexOf(userInput);
            while (index != -1) {
                mappedBuzzword = mappedBuzzword.substring(0, index) + userInput + mappedBuzzword.substring(index + 1);
                index = buzzword.indexOf(userInput, index + 1);
            }
        }
        return mappedBuzzword;
    }
    protected static boolean checkPlayerProgress(String mappedString) {
        if(!mappedString.contains("_")) {
            return true;
        }
        else {
            return false;
        }
    }
}
