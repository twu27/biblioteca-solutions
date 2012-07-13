package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<String> menuItems() {
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("View All Books");
        return menuItems;
    }

    public List<String> allBooks() {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Alice in Wonderland");
        return books;
    }
}
