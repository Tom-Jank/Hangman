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
    protected  static int userMainUI() {
        String userMainUI = """
                               ********************
                               1. ADD A BUZZWORD.
                               2. START THE GAME
                               ********************""";
        System.out.println(userMainUI);
        int decision = getUserInput();
        return decision;
    }
    protected static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int nextTODO = sc.nextInt();
        return nextTODO;
    }
}
