public class TUI {
    protected static String returnMappedBuzzword(String buzzword) {
        String mappedBuzzword = new String();
        for(int i=0; i<buzzword.length(); i++) {
            if(buzzword.charAt(i) == ' ') mappedBuzzword += ' ';
            else mappedBuzzword += '_';
        }
        return mappedBuzzword;
    }
}
