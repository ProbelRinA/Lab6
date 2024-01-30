package Serializable_Cloneable_Comparable;

public class Book implements Comparable<Book>
{
    private String title;
    private String author;

    public Book(String title, String author)
    {
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo (Book other)
    {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString()
    {
        return "\nTitle: " + title + "\nAuthor: " + author;
    }
}
