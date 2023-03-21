package HW12;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author ("Howard", "Lovecraft");
        Author author2 = new Author("Jack", "London");

        Book book1 = new Book("The Call of Cthulhu", author1, 1928);
        System.out.println("book1.bookTitle = " + book1.getBookTitle());
        System.out.println("author1.getName() = " + author1.getFirstNameName());
        System.out.println("author1.getName() = " + author1.getSurename());
        System.out.println("book1.age = " + book1.getAge());
        book1.setAge(1950);
        System.out.println("book1.age = " + book1.getAge());
        System.out.println();

        Book book2 = new Book("The Call of the Wild", author2, 1903);
        System.out.println("book2.bookTitle = " + book2.getBookTitle());
        System.out.println("author1.getName() = " + author2.getFirstNameName());
        System.out.println("author1.getName() = " + author2.getSurename());
        System.out.println("book2.age = " + book2.getAge());
    }
}