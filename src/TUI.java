import java.util.Scanner;
public class TUI {
    protected static String returnMappedBuzzword(String buzzword) {
        StringBuilder mappedBuzzword = new StringBuilder();
        for (int i = 0; i < buzzword.length(); i++) {
            if (buzzword.charAt(i) == ' ') mappedBuzzword.append(' ');
            else mappedBuzzword.append('_');
        }
        return mappedBuzzword.toString();
    }

    protected static char getUserInput() {
        Scanner sc = new Scanner(System.in);
        //char nextTODO = sc.nextLine().toUpperCase().charAt(0);
        return sc.nextLine().toUpperCase().charAt(0);
    }

    protected static char userMainUI() {
        String userMainUI = """
                ********************
                1. START THE GAME
                2. ADD A BUZZWORD
                ********************""";
        System.out.println(userMainUI);
        //char decision = getUserInput();
        return getUserInput();
    }

    protected static char gameMenu() {
        String gameMenu = """
                Insert a letter:\t""";
        System.out.print(gameMenu);
        //char userInput = getUserInput();
        return getUserInput();
    }

    protected static void drawHangmanPic(int lives) {
        System.out.println(hangmanPics[7 - lives]);
    }
    protected static void resultInformationIfWon() {
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    protected static void resultInformationIfLost() {
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String[] hangmanPics = {
            """
                                    +---+
                                    |   |
                                        |
                                        |
                                        |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O   |
                                        |
                                        |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O   |
                                    |   |
                                        |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O   |
                                   /|   |
                                        |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O/  |
                                   /|   |
                                        |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O/  |
                                   /|   |
                                   /    |
                                        |
                                    =========
                                    """,
            """
                                    +---+
                                    |   |
                                    O/  |
                                   /|   |
                                   / |  |
                                        |
                                    =========
                                    """,
    };
}
