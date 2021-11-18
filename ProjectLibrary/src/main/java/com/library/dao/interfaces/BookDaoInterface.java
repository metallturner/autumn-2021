package com.library.dao.interfaces;

import com.library.domain.models.Book;

public interface BookDaoInterface {
    public void createBook(String name, String isbn, String author, String location,
                           int yearPub, int monthPub, int dayPub,
                           int yearAdd, int monthAdd, int dayAdd,
                           int yearMod, int monthMod, int dayMod);
    public Book searchBookId(int id);
    public void deleteBook(int id);
    public void showContent();
}
