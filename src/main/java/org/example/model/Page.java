package org.example.model;

public class Page {
    protected String _title;
    protected int _currentPage;
    public Page(){
        _currentPage = 0;
    }
    public int getCurrentPage() { return _currentPage; }
    public void setCurrentPage(int pageNumber) { _currentPage += pageNumber; }
}
