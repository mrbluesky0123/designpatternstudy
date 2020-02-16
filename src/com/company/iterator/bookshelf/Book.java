package com.company.iterator.bookshelf;

public class Book {

  private String name;

  public Book(String name) {

    this.name = name;

  }

  public String getName() {

    return this.name;

  }

  public String toString(){

    return new StringBuilder().append("#Book name: ").append(this.name + "\n").toString();

  }

}
