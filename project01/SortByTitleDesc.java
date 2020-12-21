package project_1;

public class SortByTitleDesc extends Library{
    @Override
    boolean condition(Book b1, Book b2) {
        return b2.getTitle().compareTo(b1.getTitle()) > 0;
    }
}
