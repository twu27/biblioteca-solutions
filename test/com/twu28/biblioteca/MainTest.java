package com.twu28.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainTest {
    /**
     * 1. View All Books
     * 0. Exit
     * <p/>
     * Select Menu Item : _
     */
    @Test
    public void shouldCallBibliotecaToGetListOfMenuItems() {
        OutputDevice mockOutputDevice = mock(OutputDevice.class);

        new Main(mockOutputDevice, null).displayMenu();

        verify(mockOutputDevice).output("1. View All Books\n0. Exit\nSelect Menu Item :");
    }

    @Test(timeout = 500)
    public void shouldExitApplicationWhenSelectedExitMenu() {
        OutputDevice mockOutputDevice = mock(OutputDevice.class);
        InputDevice mockInputDevice = mock(InputDevice.class);

        when(mockInputDevice.read()).thenReturn(0);

        new Main(mockOutputDevice, mockInputDevice).run();

        verify(mockOutputDevice).output("Bye!");
    }

    /**
     * 1. View All Books
     * 0. Exit
     * <p/>
     * Select Menu Item : 1
     *
     * All the Books
     * 1. Alice in Wonderland
     *
     * 1. View All Books
     * 0. Exit
     * <p/>
     * Select Menu Item : 0
     *
     */
    @Test(timeout = 500)
    public void shouldDisplayListOfBooksWhenViewAllBooksMenuItemIsSelected() {
        OutputDevice mockOutputDevice = mock(OutputDevice.class);
        InputDevice mockInputDevice = mock(InputDevice.class);
        when(mockInputDevice.read()).thenReturn(1, 0);

        new Main(mockOutputDevice, mockInputDevice).run();

        verify(mockOutputDevice).output("All the Books\n1. Alice in Wonderland\n\n");

    }
}
