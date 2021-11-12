import java.util.TreeSet;

public class Main {

    public static void printTree(TreeSet<Book> books){
        for (Book b:books){
            System.out.println(b.getName() + " => " + b.getNumberOfPages() + " pages.");
        }
    }

    public static void main(String[] args) {

        TreeSet<Book> booksSortedByName = new TreeSet<>(new Comparators.compareByName());

        Book dune = new Book("Dune", "Frank Herbert", 412, 1965);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 320, 1999);
        Book warAndPeace = new Book("War and Peace", "Lev Tolstoy", 1225, 1867);
        Book sherlockHolmes = new Book("Sherlock Holmes", "A.C. Doyle", 200, 1890);
        Book khamsa = new Book("Khamsa of Nizami", "Nizami Ganjavi", 250, 1165);

        booksSortedByName.add(dune);
        booksSortedByName.add(harryPotter);
        booksSortedByName.add(warAndPeace);
        booksSortedByName.add(sherlockHolmes);
        booksSortedByName.add(khamsa);

        System.out.println("#####################");
        System.out.println("Books Sorted By Name : ");
        printTree(booksSortedByName);

        TreeSet<Book> booksSortedByNumberOfPages = new TreeSet<>(new Comparators.compareByNumberOfPages());

        booksSortedByNumberOfPages.addAll(booksSortedByName);
        System.out.println("#####################");
        System.out.println("Books Sorted By Number of Pages(ascending order) : ");
        printTree(booksSortedByNumberOfPages);

        TreeSet<Book> booksSortedByNumberOfPagesDesc = new TreeSet<>(new Comparators.compareByNumberOfPages().reversed());

        booksSortedByNumberOfPagesDesc.addAll(booksSortedByName);
        System.out.println("#####################");
        System.out.println("Books Sorted By Number of Pages(descending order) : ");
        printTree(booksSortedByNumberOfPagesDesc);
    }
}
