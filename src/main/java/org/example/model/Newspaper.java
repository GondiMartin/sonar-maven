package org.example.model;

public class Newspaper extends Page{

    public Newspaper(String title) {
        super();
        _title = title;
    }
    @Override public int getCurrentPage() { return _currentPage; }
    @Override public void setCurrentPage(int pageNumber) { _currentPage += pageNumber; }
}
