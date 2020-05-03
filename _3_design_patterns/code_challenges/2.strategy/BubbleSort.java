package strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        boolean k;
        do {
            k = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                    k = false;
                }
            }
        } while (!k);
    }
}