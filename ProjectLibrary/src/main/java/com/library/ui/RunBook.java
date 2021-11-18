package com.library.ui;

import com.library.domain.ControllerInterfaces.BookControllerInterface;
import com.library.domain.Controllers.BookController;
import com.library.domain.models.Messages;

import java.util.Scanner;

public class RunBook implements RunInterface {
    BookControllerInterface bookControllerInterface = new BookController();
    Scanner sc = new Scanner(System.in);

    @Override
    public void show() {
        System.out.println(Messages.CREATE);
        System.out.println(Messages.DELETE);
        System.out.println(Messages.SEARCH);
        System.out.println(Messages.UPDATE);
        System.out.println(Messages.CONTENT);
        System.out.println(Messages.EXIT);
        boolean b = true;
        while (b) {
            String command = sc.nextLine();
            switch (command) {
                case "1":
                    System.out.println(Messages.NAME);
                    String name = sc.nextLine();
                    System.out.println(Messages.ISBN);
                    String isbn = sc.nextLine();
                    System.out.println(Messages.AUTHOR);
                    String author = sc.nextLine();
                    System.out.println(Messages.LOCATION);
                    String location = sc.nextLine();
                    System.out.println(Messages.YEAR_PUB);
                    int yearPub = sc.nextInt();
                    System.out.println(Messages.MONTH_PUB);
                    int monthPub = sc.nextInt();
                    System.out.println(Messages.DAY_PUB);
                    int dayPub = sc.nextInt();
                    System.out.println(Messages.YEAR_ADD);
                    int yearAdd = sc.nextInt();
                    System.out.println(Messages.MONTH_ADD);
                    int monthAdd = sc.nextInt();
                    System.out.println(Messages.DAY_ADD);
                    int dayAdd = sc.nextInt();
                    System.out.println(Messages.YEAR_MOD);
                    int yearMod = sc.nextInt();
                    System.out.println(Messages.MONTH_MOD);
                    int monthMod = sc.nextInt();
                    System.out.println(Messages.DAY_MOD);
                    int dayMod = sc.nextInt();
                    bookControllerInterface.createBook(name, isbn, author, location, yearPub, monthPub, dayPub,
                            yearAdd, monthAdd, dayAdd, yearMod, monthMod, dayMod);
                    break;
                case "2":
                    System.out.println(Messages.ID);
                    int idd = sc.nextInt();
                    bookControllerInterface.deleteBook(idd);
                    break;
                case "3":
                    System.out.println(Messages.ID);
                    int id = sc.nextInt();
                    if (bookControllerInterface.searchBookId(id) == null) {
                        System.out.println("такой книги нет");
                    } else System.out.println(bookControllerInterface.searchBookId(id));
                    break;
                case "5":
                    bookControllerInterface.showContent();
                    break;

                case "exit":
                    b = false;
                    break;

                default:
                    System.out.println();
                    System.out.println(Messages.CREATE);
                    System.out.println(Messages.DELETE);
                    System.out.println(Messages.SEARCH);
                    System.out.println(Messages.UPDATE);
                    System.out.println(Messages.EXIT);

            }

        }
    }

}


