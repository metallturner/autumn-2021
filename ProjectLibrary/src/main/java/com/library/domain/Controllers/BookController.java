package com.library.domain.Controllers;

import com.library.dao.BookDao;
import com.library.dao.interfaces.BookDaoInterface;
import com.library.domain.ControllerInterfaces.BookControllerInterface;
import com.library.domain.models.Book;

public class BookController implements BookControllerInterface {
    BookDaoInterface bookDaoInterface = new BookDao();

   // public BookController(BookDaoInterface bookDaoInterface) {
       // this.bookDaoInterface = bookDaoInterface;
   // }

    public void createBook(String name, String isbn, String author, String location,
                           int yearPub, int monthPub, int dayPub,
                           int yearAdd, int monthAdd, int dayAdd,
                           int yearMod, int monthMod, int dayMod) {
        bookDaoInterface.createBook(name, isbn, author, location, yearPub, monthPub, dayPub,
                yearAdd, monthAdd, dayAdd,
                yearMod, monthMod, dayMod);
    }
    public Book searchBookId(int id) {
        return bookDaoInterface.searchBookId(id);
    }
    public void deleteBook(int id){
        bookDaoInterface.deleteBook(id);
    }
    public void showContent(){
        bookDaoInterface.showContent();
    }
}
