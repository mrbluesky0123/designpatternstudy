package com.company.iterator.bookshelf;

import com.company.iterator.bookshelf.Book;
import com.company.iterator.bookshelf.BookShelf;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {


//    BookShelf bookShelf = new BookShelf(5);
//    bookShelf.appendBook(new Book("abc"));
//    bookShelf.appendBook(new Book("123"));
//    bookShelf.appendBook(new Book("qwe"));
//    bookShelf.appendBook(new Book("rty"));
//    bookShelf.appendBook(new Book("bnm"));
//
//    Iterator<Book> itr = bookShelf.iterator();
//    while(itr.hasNext()) {
//
//      System.out.println(itr.next());
//
//    }

    Map<String, Integer> map = new TreeMap<>();
    map.put("a", 1);
    map.put("b", 2);
    map.put("x", 3);
    map.put("f", 4);
    map.put("d", 5);
    Set<Map.Entry<String, Integer>> entry = map.entrySet();
//    for(Map.Entry<String, Integer >)



  }

}
