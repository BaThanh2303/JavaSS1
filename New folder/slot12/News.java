package slot12;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    int id;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void display() {
        for (int i = 0; i < id; i++){
            System.out.println("Title: " + getTitle());
            System.out.println("PublishDate: " + getPublishDate());
            System.out.println("Author: " + getAuthor());
            System.out.println("Content: " + getContent());
            System.out.println("Rate: " + getAverageRate());
        }return;
    }
    ArrayList<Float> rateList = new ArrayList<Float>();

    public void inputRate(){
        if ()
    }
}
