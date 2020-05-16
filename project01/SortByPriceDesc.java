package project_1;

public class SortByPriceDesc extends Library {
    @Override
    boolean condition(Book b1, Book b2) {
        return b1.getPrice() < b2.getPrice();
    }
}
