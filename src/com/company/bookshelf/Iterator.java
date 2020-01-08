package com.company.bookshelf;

public interface Iterator<T> {
  public abstract boolean hasNext();
  public abstract T next();
}
