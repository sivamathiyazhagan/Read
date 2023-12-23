package io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileContent {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Siva KLR\\Desktop\\name.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int alphabetCount = 0;
            int digitCount = 0;
            int specialSymbolCount = 0;
            int spaceCount = 0;
            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        alphabetCount++;
                    } else if (Character.isDigit(ch)) {
                        digitCount++;
                    } else if (Character.isWhitespace(ch)) {
                        spaceCount++;
                    } else {
                        specialSymbolCount++;
                    }
                }
            }
            reader.close();
            System.out.println("Alphabets: " + alphabetCount);
            System.out.println("Numbers: " + digitCount);
            System.out.println("Special Symbols: " + specialSymbolCount);
            System.out.println("Blank Spaces: " + spaceCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

