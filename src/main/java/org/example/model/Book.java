package org.example.model;

public class Book extends Page{

    public Book(String title) {
        super();
        _title = title;
    }
    public String getTitle() { return _title; }
    public void setTitle(String title) { _title = title; }
}
