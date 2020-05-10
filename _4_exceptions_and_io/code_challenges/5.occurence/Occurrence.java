package occurrence;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Occurrence {
    public static void main(String[] args) {
        String[] array = readFromFile("src\\occurrence\\text.txt");
        Word[] words = get10WordsThatAppearsTheMost(array);
        for (int i = 0; i < 10; i++) {
            System.out.println(words[i].word +" - "+ words[i].nrOfAppearances);
        }
    }

    //returns a list of words read from file
    public static String[] readFromFile(String fileName) {
        String[] arr = new String[0];
        int index = 0;
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            scanner.useDelimiter(" ");
            while (scanner.hasNext()) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[index++] = scanner.next();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            ex.printStackTrace();
        }
        String[] finalArray = new String[arr.length];
        System.arraycopy(arr, 0, finalArray, 0, index);
        return finalArray;
    }


    //returns a list that contains the first 10 words that have the biggest appearance
    public static Word[] get10WordsThatAppearsTheMost(String[] arr) {
        Word[] listOfWords = new Word[10];
        for(int i =0;i<10;i++){
            listOfWords[i]=new Word("");}
        for(int i=0;i<arr.length-1;i++) {
            Word newWord = new Word(arr[i]);
            newWord.increaseNrOfAppearances();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equals(newWord.word)) {newWord.increaseNrOfAppearances();}
            }
            addWord(listOfWords,newWord);
        }
        return listOfWords;
    }

    public static Word[] addWord(Word[] tenWords,Word newWord){
        boolean k=true; int i;
        for(i=0;i<10;i++) {
            if(tenWords[i].word.equals(newWord.word)) {k=false;}
        }
        if(k){
            i=0;
            while(i<10 && k){
                if(tenWords[i].nrOfAppearances<newWord.nrOfAppearances) {
                    k = false;
                    tenWords[i] = newWord;
                }
                i++;
            }
        }
        return tenWords;
    }
}
