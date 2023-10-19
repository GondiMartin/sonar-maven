package org.example.model;

public class Newspaper extends Page{

    public Newspaper(String title) {
        super();
        _title = title;
    }
    public int getCurrentPage() { return _currentPage; }
    public void setCurrentPage(int pageNumber) { _currentPage += pageNumber; }
}
