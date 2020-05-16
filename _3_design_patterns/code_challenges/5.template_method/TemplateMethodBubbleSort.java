package template;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        //make use of method numbersInCorrectOrder to sort array
        boolean k;
        do {
            k = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (numbersInCorrectOrder(list[i], list[i+1])) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                    k = false;
                }
            }
        } while (!k);
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
