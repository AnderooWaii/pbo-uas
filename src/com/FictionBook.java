package com;
public class FictionBook extends Book {
    private String author;

    public FictionBook(String name, String category, String author) {
        super(name, category);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Author: " + author);
        System.out.println();
    }
}
