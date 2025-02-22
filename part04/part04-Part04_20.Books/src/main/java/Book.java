/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    private String title;
    private int numberOfPages;
    private int publishedYear;
    
    public Book (String title, int numberOfPages, int publishedYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publishedYear = publishedYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String toString() {
        return (this.title + ", " + this.numberOfPages + " pages, " + this.publishedYear);
    }
}
