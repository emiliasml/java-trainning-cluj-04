package project_1;

public class Book {
    //required parameters
    private final String title, author, ISBN;
    private final float price;
    //optional parameters
    private final Integer publicationYear, nrPages;
    private final String publisher, language, format, category;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public float getPrice() {
        return price;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getFormat() {
        return this.format;
    }

    public String getCategory() {
        return this.category;
    }

    public Integer getPublicationYear() {
        return this.publicationYear;
    }

    public Integer getNrPages() {
        return this.nrPages;
    }

    private Book(Builder b) {
        this.title = b.title;
        this.author = b.author;
        this.ISBN = b.ISBN;
        this.publicationYear = b.publicationYear;
        this.price = b.price;
        this.nrPages = b.nrPages;
        this.publisher = b.publisher;
        this.language = b.language;
        this.format = b.format;
        this.category = b.category;
    }

    @Override
    public String toString() {
        return '\'' + title + '\'' +
                ", by " + author +
                ", ISBN:" + ISBN +
                ", " + price +
                ", publicationYear: " + publicationYear +
                ", nrPages: " + nrPages +
                ", publisher: " + publisher +
                ", language: " + language +
                ", format: " + format +
                ", category: " + category;
    }


    public static class Builder {
        private final String title, author, ISBN;
        private final float price;
        private Integer publicationYear, nrPages;
        private String publisher, language, format, category;

        public Builder(String title, String author, String ISBN, float price) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.price = price;
        }

        public Builder setPublicationYear(Integer publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        public Builder setNrPages(Integer nrPages) {
            this.nrPages = nrPages;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}