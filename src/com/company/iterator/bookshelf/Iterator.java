package com.company.iterator.bookshelf;

public interface Iterator<T> {
  public abstract boolean hasNext();
  public abstract T next();
}
