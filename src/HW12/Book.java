package HW12;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int age;

    public Book (String bookTitle, Author author, int age) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.age = age;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Название: " + this.bookTitle + " Автор: " + this.author + " Год издания: " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, age);
    }
}
