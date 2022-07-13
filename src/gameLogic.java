public class gameLogic {
    public boolean isStillPlaying;
    public int playerLifeCounter;
    public gameLogic() {
        playerLifeCounter = 8;
        isStillPlaying = true;
    }
    protected static boolean checkIfPlayerIsCorrect(String buzzword, char userInput) {
        if(buzzword.indexOf(userInput) < 0) return false;
        else return true;
    }
    protected static String updatePlayerProgress(String buzzword, char userInput, String mappedBuzzword) {
        for (int i = 0; i <= buzzword.length(); i++) {
            if (buzzword.charAt(i) == userInput)
                mappedBuzzword = mappedBuzzword.substring(0, i) + userInput + mappedBuzzword.substring(i + 1);
            return mappedBuzzword;
        }
        return mappedBuzzword;
    }
}
