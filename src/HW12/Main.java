package HW12;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author ("Howard", "Lovecraft");
        Author author2 = new Author("Jack", "London");
        Author author3 = new Author("Jack", "London");

        Book book1 = new Book("The Call of Cthulhu", author1, 1928);
        System.out.println("book1.bookTitle = " + book1.getBookTitle());
        System.out.println("author1.getName() = " + author1.getFirstNameName());
        System.out.println("author1.getName() = " + author1.getSurename());
        System.out.println("book1.age = " + book1.getAge());
        book1.setAge(1955);
        System.out.println("book1.age = " + book1.getAge());
        System.out.println();

        Book book2 = new Book("The Call of the Wild", author2, 1903);
        System.out.println("book2.bookTitle = " + book2.getBookTitle());
        System.out.println("author1.getName() = " + author2.getFirstNameName());
        System.out.println("author1.getName() = " + author2.getSurename());
        System.out.println("book2.age = " + book2.getAge());
        System.out.println();
        System.out.println(author1);
        System.out.println(book1);
        System.out.println("author2 = " + author2);
        System.out.println("book2 = " + book2);
        System.out.println();

        Book book3 = new Book("The Call of the Wild", author2, 1903);
        Book book4 = new Book("The Call of the Wild", author3, 1903);
        System.out.println("book1.equals(book3) = " + book1.equals(book3));
        System.out.println("book4.equals(book3) = " + book4.equals(book3));
        System.out.println();
        System.out.println("author1.equals(author3) = " + author1.equals(author3));
        System.out.println("author2.equals(author3) = " + author2.equals(author3));
        System.out.println();

        System.out.println(book3.hashCode() == book1.hashCode());
        System.out.println(book3.hashCode() == book4.hashCode());
        System.out.println(author2.hashCode() == author1.hashCode());
        System.out.println(author2.hashCode() == author3.hashCode());
    }
}