package nybles.tech.nyblesapp;

/**
 * Created by akanksha on 1/9/17.
 */

public class Article {
    private String name;
    private String author;
    private int thumbnail;

    public Article() {
    }

    public Article(String name, String author, int thumbnail) {
        this.name = name;
        this.author = author;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}