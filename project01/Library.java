package project_1;

public abstract class Library {
    void sortBooks(Book[] books) {
        for (int index1 = 0; index1 < books.length - 1; index1++)
            for (int index2 = index1 + 1; index2 < books.length; index2++)
                if (condition(books[index1], books[index2])) {
                    Book aux = books[index1];
                    books[index1] = books[index2];
                    books[index2] = aux;
                }
    }

    abstract boolean condition(Book b1, Book b2);
}

