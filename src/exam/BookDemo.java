package exam;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russel","Winderand");
        Book book1 = new Book("Developing Java Software",author,78.75);
        System.out.println(book1);
    }
}
