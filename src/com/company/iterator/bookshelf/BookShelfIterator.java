package com.company.iterator.bookshelf;



public class BookShelfIterator implements Iterator<Book> {

  private BookShelf bookShelf;
  private int index;
  public BookShelfIterator(BookShelf bookShelf) {

    this.bookShelf = bookShelf;
    this.index = 0;

  }

  public boolean hasNext() {

    if (this.index < bookShelf.getLength()) {
      return true;
    } else {
      return false;
    }

  }

  public Book next(){

    Book book = bookShelf.getBook(index);
    index++;
    return book;

  }

}
