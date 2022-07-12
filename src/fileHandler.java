import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class fileHandler {
    protected static void createHangmanWordDatabase() {
        try {
            File newFile = new File("DATABASE.txt");
            if (newFile.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
