package com;

public abstract class Book {
    protected String name;
    protected String category;

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
