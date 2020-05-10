package secret_message;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        System.out.println(getCodedMessage(readFromFile("src\\secret_message\\message.txt")));
    }

    public static String[] readFromFile(String file) {
        String[] words = new String[0];
        int i = 0;
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
            s.useDelimiter(" ");
            while (s.hasNext()) {
                String word = s.next();
                words = Arrays.copyOf(words, words.length + 1);
                words[i++] = word;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        String[] returedArray = new String[i];
        System.arraycopy(words, 0, returedArray, 0, i);
        return returedArray;
    }

    public static String getCodedMessage(String[] words) {
        String message = "";
        for (String word : words) {
            String[] letter = word.split("");
            for (String s : letter)
                if (s.equals("X")) message += " ";
                else if (s.toUpperCase().equals(s) && !s.toLowerCase().equals(s))
                    message += s;
        }
        return message;
    }
}