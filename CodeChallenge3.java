package myFirstClass;
import java.util.Scanner;

public class CodeChallenge3 {
    public static void main(String[] args) {
        int[] array = readArray();
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("The number of pairs is: " + numberOfPairs(array));
    }

    //Desc: a funct that reads and returns an array of integers
    private static int[] readArray() {
        System.out.println("Give the length of the array:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Give all the elements:");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //Desc: a function that returns the number of pairs from the array
    //a pair is defined as any 2 numbers added  result 0
    //a number involved in a pair cannot be pair of another pair
    private static int numberOfPairs(int[] arr) {
        int pairs = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                int j = i + 1;
                while (j < arr.length && arr[i] != -arr[j]) j++;
                if(j != arr.length){
                    pairs++;
                    arr[j]=0;
                }
            }
        }
        return pairs;
    }
}
