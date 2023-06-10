package com;
public class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String name, String category, String topic) {
        super(name, category);
        this.topic = topic;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
