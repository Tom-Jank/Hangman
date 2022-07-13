public class Main {
    public static void main(String[] args) {
        while(true) {
            int decision = TUI.userMainUI();
            switch (decision) {
                case 1:
                    System.out.println("DEcision 1");
                    break;
                case 2:
                    System.out.println("Decision 2");
                    break;
                default:
                    break;
            }
        }
    }
}