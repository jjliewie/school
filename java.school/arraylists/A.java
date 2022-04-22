package arraylists;

import java.util.ArrayList;

public class A {

    public static void main(String[] args) {
        
        ArrayList<Book> Library = new ArrayList<Book>();

        Book book1 = new Book("JK Rowling", "Harry Potter", 451);
        Library.add(book1);
    }
    
}

class Book {

    private String author;
    private String title;
    private int page;

    Book (String author, String title, int page){
        this.author = author;
        this.title = title;
        this.page = page;
    }

    String getAuthor(){
        return author;
    }

    String getTitle(){
        return title;
    }

    int getPage(){
        return page;
    }

    void setAuthor(String x){
        author = x;
    }

    void setTitle(String x){
        title = x;
    }

    void setPage(int x){
        page = x;
    }
}
