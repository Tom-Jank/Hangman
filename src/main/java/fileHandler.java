package main.java;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class fileHandler {
    protected static void createHangmanWordDatabase() {
        try {
            File newFile = new File("src/main/resources/DATABASE.txt");
            if (newFile.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    protected static void writeBuzzwordToDatabase() {
        try {
            //TODO check if user didn't put an empty string
            PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/DATABASE.txt"), true);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter buzzword: ");
            String buzzword = scanner.nextLine().trim().toUpperCase();
            writer.append(buzzword).append("\n");
            writer.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    protected static String selectRandomBuzzword() {
        try {
            List<String> database = new ArrayList<>();
            File DATABASE = new File("src/main/resources/DATABASE.txt");
            Scanner reader = new Scanner(DATABASE);
            while (reader.hasNextLine()) {
                database.add(reader.nextLine());
            }
            int randomBuzzword = new Random().nextInt(database.size());
            return database.get(randomBuzzword);
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Something went wrong...";
        }
    }
}
