package linter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static String linterMessage(String path) {
        Scanner scanner = null;
        String letter = "";
        int lineNumber = 1;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("./src/main/resources/" + path)));
            String lines;
            while (scanner.hasNextLine()) {
                lines = scanner.nextLine();
                letter = letter+ errorChecker(lines, lineNumber);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        if (letter.equals("")) return "The file has no missing semicolons";
        else return letter;
    }

    private static String errorChecker(String line, int lineNumber) {

        char last = ' ';
        StringBuilder letter = new StringBuilder();

        if (line.length() != 0) {
            last = line.charAt(line.length() - 1);
        }

        if (!line.contains("if") && !line.contains("else") && last != '{' && last != '}' && line.length() != 0) {
            if (last != ';') {
                letter.append("Line ").append(lineNumber).append(": Missing semicolon").append("\n");
            }
        }

        return letter.toString();
    }

    public static void main(String[] args) {
        System.out.println(linterMessage("gates.js"));
        System.out.println(linterMessage("nothing.txt"));
        System.out.println(linterMessage("like.js"));

    }
}
