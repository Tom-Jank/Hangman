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
        //for (int i = 0; i <= buzzword.length(); i++) {
        //    if (buzzword.charAt(i) == userInput)
        //        mappedBuzzword = mappedBuzzword.substring(0, i) + userInput + mappedBuzzword.substring(i + 1);
         //   return mappedBuzzword;
        //}

        if (buzzword.indexOf(userInput) != -1) {
            int index = buzzword.indexOf(userInput);
            while (index != -1) {
                mappedBuzzword = mappedBuzzword.substring(0, index) + userInput + mappedBuzzword.substring(index + 1);
                index = buzzword.indexOf(userInput, index + 1);
            }
        }
        return mappedBuzzword;
    }
}
