import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> filteredBooks = new ArrayList<>();
        HashMap<String,String> books = new HashMap<>();

        bookList.add(new Book("Sherlock Holmes", 99, "Arthur C. D."));
        bookList.add(new Book("Dune", 516, "Frank Herbert"));
        bookList.add(new Book("1984", 50, "George O."));
        bookList.add(new Book("Harry Potter", 1200, "J.K.Rowling"));
        bookList.add(new Book("Chess", 120, "Stefan Zweig"));
        bookList.add(new Book("Pride and Prejudice", 230, "Jane Austen"));
        bookList.add(new Book("Jane Ayre", 150, "Jane Austen"));
        bookList.add(new Book("Hamsa", 80, "N. Gencevi"));
        bookList.add(new Book("Odyssey", 250, "Homer"));
        bookList.add(new Book("Crime and Punishment", 90, "Fyodor Dostoevsky"));

        bookList.forEach(book -> books.put(book.getName(),book.getAuthorName()));
        books.forEach((name,authorName)-> System.out.println(name + " : " + authorName));

        bookList.stream().filter(book -> book.getPages() >= 100 ).forEach(book -> filteredBooks.add(book));
        System.out.println();
        System.out.println("Books with more than 100 pages :");
        filteredBooks.forEach(book -> System.out.println(book.getAuthorName() + " : " + book.getName() + "("+ book.getPages() +")"));

    }
}
