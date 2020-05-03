package iterator;

public class ArrayCustomIterator {
    private int[] array;
    private int position;

    public ArrayCustomIterator(int[] arr){
        this.array=arr;
        this.position=0;
    }

    public boolean hasNext(){
        return (position<array.length);
    }
    public int next(){
        return array[position++];
    }
}
