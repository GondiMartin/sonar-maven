package org.example.model;

public class Page {
    protected String _title;
    protected int _currentPage;

    public Page(){
        _currentPage = 0;
    }

    public String getTitle() { return _title; }
    public void setTitle(String title) { _title = title; }

    public int getCurrentPage() { return _currentPage; }
    public void setCurrentPage(int pageNumber) { _currentPage += pageNumber; }

    public boolean hasSameTitle(String title){
        return _title.equals(title);
    }
}
