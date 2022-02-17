import java.util.Calendar;
import java.util.Date;

public class Book {
    String name;
    int pages;
    String authorName;
    Date publishDate;

    public Book(String name, int pages, String authorName) {
        this.name = name;
        this.pages = pages;
        this.authorName = authorName;
        this.publishDate = Calendar.getInstance().getTime();
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPages() {
        return pages;
    }
}
