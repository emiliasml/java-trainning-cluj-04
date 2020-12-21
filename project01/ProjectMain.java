package project_1;

public class ProjectMain {
    static public void main(String[] args) {
        Book book1 = new Book.Builder("Baiatul cu pijamale in dungi",
                "John Boyne", " RAO978-606-776-184-9", 909.9f).build();
        Book book2 = new Book.Builder("Night over wather", "Ken Follett", "9098-0992-212", 25)
                .setLanguage("english")
                .setNrPages(650)
                .setPublicationYear(1991)
                .build();
        Book book3 = new Book.Builder("Bunicuta hotomana", "David Walliams",
                "123-123-12339", 42.62f).build();
        Book book4 = new Book.Builder("Baiatul miliardar", "David Walliams", "09978-212",
                33.5f).setPublicationYear(2010)
                .setLanguage("romana")
                .build();
        Book book5 = new Book.Builder("Biblia", "Dumnezeu", "092-222", 100)
                .setNrPages(2000)
                .build();
        Book book6 = new Book.Builder("Xilofonul verde", "Nicolae", "000-000-123",
                899.99f).setPublicationYear(2020)
                .setLanguage("romana")
                .setNrPages(4000)
                .setCategory("aventura")
                .setFormat("hardcover")
                .setPublisher("RAO")
                .build();
        Book book7 = new Book.Builder("Guten Tag", "William Goethe",
                "980-791-2", 0.5f)
                .setLanguage("deutsch")
                .setPublicationYear(1994)
                .build();

        Book[] books = {book1, book2, book3, book4, book5, book6, book7};
        print(books);
        SortByPrice sortByPrice = new SortByPrice();
        sortByPrice.sortBooks(books);
        print(books);
        SortByTitle sortByTitle = new SortByTitle();
        sortByTitle.sortBooks(books);
        print(books);
        SortByTitleDesc sortByTitleDesc = new SortByTitleDesc();
        sortByTitleDesc.sortBooks(books);
        print(books);
        SortByPriceDesc sortByPriceDesc = new SortByPriceDesc();
        sortByPriceDesc.sortBooks(books);
        print(books);
    }

    public static void print(Book[] books) {
        System.out.println();
        System.out.println("The books are:");
        for (Book b : books)
            System.out.println(b);
    }
}
