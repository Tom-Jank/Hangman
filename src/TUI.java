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
    protected static char gameMenu() {
        String gameMenu = """
                Insert a letter: """;
        System.out.print(gameMenu);
        char userInput = getUserInput();
        return userInput;
    }
    protected static void resultInformation(boolean result) {
        if(result) {
            System.out.println("""
                    
                     __      __                         __       __  __          \s
                    /  \\    /  |                       /  |  _  /  |/  |         \s
                    $$  \\  /$$/______   __    __       $$ | / \\ $$ |$$/  _______ \s
                     $$  \\/$$//      \\ /  |  /  |      $$ |/$  \\$$ |/  |/       \\\s
                      $$  $$//$$$$$$  |$$ |  $$ |      $$ /$$$  $$ |$$ |$$$$$$$  |
                       $$$$/ $$ |  $$ |$$ |  $$ |      $$ $$/$$ $$ |$$ |$$ |  $$ |
                        $$ | $$ \\__$$ |$$ \\__$$ |      $$$$/  $$$$ |$$ |$$ |  $$ |
                        $$ | $$    $$/ $$    $$/       $$$/    $$$ |$$ |$$ |  $$ |
                        $$/   $$$$$$/   $$$$$$/        $$/      $$/ $$/ $$/   $$/\s
                                                                                 \s
                                                                                 \s
                                                                                 \s
                    """);
        }
        else {
            System.out.println("""
                    
                    $$\\     $$\\                         $$\\                                   \s
                    \\$$\\   $$  |                        $$ |                                  \s
                     \\$$\\ $$  /$$$$$$\\  $$\\   $$\\       $$ |      $$$$$$\\   $$$$$$$\\  $$$$$$\\ \s
                      \\$$$$  /$$  __$$\\ $$ |  $$ |      $$ |     $$  __$$\\ $$  _____|$$  __$$\\\s
                       \\$$  / $$ /  $$ |$$ |  $$ |      $$ |     $$ /  $$ |\\$$$$$$\\  $$$$$$$$ |
                        $$ |  $$ |  $$ |$$ |  $$ |      $$ |     $$ |  $$ | \\____$$\\ $$   ____|
                        $$ |  \\$$$$$$  |\\$$$$$$  |      $$$$$$$$\\\\$$$$$$  |$$$$$$$  |\\$$$$$$$\\\s
                        \\__|   \\______/  \\______/       \\________|\\______/ \\_______/  \\_______|
                                                                                              \s
                                                                                              \s
                                                                                              \s
                    """);
        }
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
