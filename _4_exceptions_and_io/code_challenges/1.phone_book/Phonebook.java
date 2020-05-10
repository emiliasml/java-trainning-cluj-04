package phonebook;

import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Phonebook {
    public static void main(String[] args) {
        String[] arr = new String[10];
        int i = 0;
        try (Scanner scanner = new Scanner(
                new BufferedReader(new FileReader(
                    "src\\phonebook\\phonebook.txt")))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String word = scanner.next();
                arr[i] = word;
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (arr[0] != null) {
            System.out.println(findNumberByName("Abbey", arr));
            System.out.println(findNumberByName("Abdul", arr));
            System.out.println(findNumberByName("Diana", arr));
        }
    }

    public static String findNumberByName(String name, String[] arr) {
        int i = 0;
        String rez = name + "'s phone number is ";
        while (arr[i] != null) {
            String[] element = arr[i].split(" ");
            if (element[0].equals(name)) {
                rez = rez + element[1];
                return rez;
            }
            i++;
        }
        return rez + "not found";
    }
}