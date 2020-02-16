package com.company.iterator.bookshelf;


public interface Aggregate<T> {
  public abstract Iterator<T> iterator();
}
