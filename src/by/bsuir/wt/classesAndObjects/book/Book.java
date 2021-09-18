package by.bsuir.wt.classesAndObjects.book;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book() {
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || b.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) b;
        return book.price == price &&
                Objects.equals(book.title, this.title) &&
                Objects.equals(book.author, this.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book info:" +
                "title='" + title +
                "', author='" + author +
                "', price=" + price +
                ".";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book o) {
        return this.getIsbn() - o.getIsbn();
    }

    public static Comparator<Book> TitleComparator = Comparator.comparing(Book::getTitle);

    public static Comparator<Book> TitleAuthorComparator = (o1, o2) -> {
        if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        return o1.getTitle().compareTo(o2.getTitle());
    };
    public static Comparator<Book> AuthorTitlePriceComparator = (o1, o2) -> {
        if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
            if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
                return o1.getPrice() - o2.getPrice();
            }
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    };
}
