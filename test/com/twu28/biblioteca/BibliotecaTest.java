package com.twu28.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class BibliotecaTest {
    @Test
    public void shouldReturnListOfMenuItems() {
        List<String> menuItems = new Biblioteca().menuItems();
        assertThat(menuItems, hasItem("View All Books"));
    }

    @Test
    public void shouldReturnListOfBooks() {
        List<String> books = new Biblioteca().allBooks();
        assertThat(books, hasItem("Alice in Wonderland"));
    }
}
