package project_1;

public class SortByTitle extends Library{
    @Override
    boolean condition(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle()) > 0;
    }
}
