package com.company;

import com.company.bookshelf.Book;
import com.company.bookshelf.BookShelf;
import com.company.bookshelf.Iterator;

public class Main {

  public static void main(String[] args) {


    BookShelf bookShelf = new BookShelf(5);
    bookShelf.appendBook(new Book("abc"));
    bookShelf.appendBook(new Book("123"));
    bookShelf.appendBook(new Book("qwe"));
    bookShelf.appendBook(new Book("rty"));
    bookShelf.appendBook(new Book("bnm"));

    Iterator<Book> itr = bookShelf.iterator();
    while(itr.hasNext()) {

      System.out.println(itr.next());

    }

  }

}
