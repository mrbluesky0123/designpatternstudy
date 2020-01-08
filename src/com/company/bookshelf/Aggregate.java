package com.company.bookshelf;


public interface Aggregate<T> {
  public abstract Iterator<T> iterator();
}
