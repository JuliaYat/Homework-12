package HW12;

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
}
