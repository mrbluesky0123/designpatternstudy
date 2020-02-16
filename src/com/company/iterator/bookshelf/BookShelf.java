package com.company.iterator.bookshelf;

public class BookShelf implements Aggregate<Book> {

  private Book[] books;
  private int last;

  public BookShelf(int maxSize) {
    this.books = new Book[maxSize];
    this.last = 0;
  }

  public Book getBook(int index) {

    return books[index];

  }

  public void appendBook(Book book) {

    this.books[this.last++] = book;

  }

  public int getLength() {

    return this.last;

  }

  @Override
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }

}
