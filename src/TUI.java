import java.util.Scanner;
public class TUI {
    protected static String returnMappedBuzzword(String buzzword) {
        String mappedBuzzword = new String();
        for(int i=0; i<buzzword.length(); i++) {
            if(buzzword.charAt(i) == ' ') mappedBuzzword += ' ';
            else mappedBuzzword += '_';
        }
        return mappedBuzzword;
    }
    protected  static char userMainUI() {
        String userMainUI = """
                               ********************
                               1. START THE GAME
                               2. ADD A BUZZWORD
                               ********************""";
        System.out.println(userMainUI);
        char decision = getUserInput();
        return decision;
    }
    protected static void gameMenu() {
        String gameMenu = """
                Insert a letter: """;
        Scanner sc = new Scanner(System.in);
    }
    protected static boolean isUserCorrect() {

        return false;
    }
    protected static char getUserInput() {
        Scanner sc = new Scanner(System.in);
        char nextTODO = sc.nextLine().charAt(0);
        return nextTODO;
    }
}
