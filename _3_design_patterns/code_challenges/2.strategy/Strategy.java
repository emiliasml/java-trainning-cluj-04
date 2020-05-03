package strategy;

import java.util.Arrays;

public class Strategy {
    public void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);
        Strategy strategy = new Strategy();
        strategy.displaySorted(new BubbleSort(), copy01OfArr);
        strategy.displaySorted(new MergeSort(),copy02OfArr);
        System.out.println("The given array:");
        printArray(arr);
        System.out.println("\nThe array bubble sorted:");
        printArray(copy01OfArr);
        System.out.println("\nThe array merge sorted:");
        printArray(copy02OfArr);
    }
    public static void printArray(Integer[] array){
        for(Integer elem:array)
            System.out.print(elem + " ");
    }
}
