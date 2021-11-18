package com.library.dao;

import com.library.dao.interfaces.BookDaoInterface;
import com.library.domain.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao implements BookDaoInterface {
    List<Book> books = new ArrayList<>();

    @Override
    public void createBook(String name, String isbn, String author, String location,
                           int yearPub, int monthPub, int dayPub,
                           int yearAdd, int monthAdd, int dayAdd,
                           int yearMod, int monthMod, int dayMod) {
        int x = books.size() + 1;
        books.add(new Book(x, name, isbn, author, location, yearPub, monthPub, dayPub,
                yearAdd, monthAdd, dayAdd,
                yearMod, monthMod, dayMod));
        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    @Override
    public Book searchBookId(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void deleteBook(int id) {
        for (Book book :
                books) {
            if (book.getId() == id) {
            books.remove(book);

            } else System.out.println("Книги с таким ID нет в библиотеке");
        }

    }

    @Override
    public void showContent() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}


