package template;

import java.util.Arrays;

public class TemplateMethodExample {
    public static void main(String[] args){
        Integer[] arr = new Integer[] {1, 4, 5, 6, 2, 3, 7, 9, 0, 8};
        Integer[] copy01Arr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02Arr = Arrays.copyOf(arr, arr.length);
        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01Arr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02Arr);

        displaySorted(copy01Arr);
        displaySorted(copy02Arr);

    }

    public static void displaySorted(Integer[] arr){
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
