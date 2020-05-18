package pairs;

public class Pair<T extends Shoe> {
    private final T first, second;

    public Pair(T first, T second) throws SizesDontMatchException, ColorsDontMatchException {
        this.first = first;
        this.second = second;
        match(first, second);
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    private void match(T first, T second) throws ColorsDontMatchException, SizesDontMatchException {
        if (!first.getColor().equals(second.getColor())) {
            throw new ColorsDontMatchException("Wrong color!");
        }
        if (first.getSize() != second.getSize()) {
            throw new SizesDontMatchException("Wrong size!");
        }
    }
}
