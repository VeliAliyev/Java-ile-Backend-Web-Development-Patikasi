import java.util.Comparator;

public class Comparators {

    public static class compareByName implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class compareByNumberOfPages implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getNumberOfPages() - o2.getNumberOfPages();
        }
    }
}
