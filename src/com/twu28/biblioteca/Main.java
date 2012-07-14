package com.twu28.biblioteca;

public class Main {
    private final OutputDevice outputDevice;
    private final InputDevice inputDevice;

    public Main(OutputDevice outputDevice, InputDevice inputDevice) {
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
    }

    public void displayMenu() {
        String[] menuItems = new Biblioteca().menuItems().toArray(new String[]{});
        String output = "";
        for (int i = 0; i < menuItems.length; i++) {
            String menuItem = menuItems[i];
            output += (i + 1) + ". " + menuItem + "\n";
        }
        output += "0. Exit\n";
        output += "Select Menu Item :";

        outputDevice.output(output);
    }

    public void selectMenu(int menuItem) {
    }

    public void run() {
        while (true) {
            displayMenu();
            int selectedMenuItem = inputDevice.read();
            if (selectedMenuItem == 0) {
                outputDevice.output("Bye!");
                break;
            }

            if (selectedMenuItem == 1) {
                String[] books = new Biblioteca().allBooks().toArray(new String[]{});
                String output = "All the Books\n";
                for (int i = 0; i < books.length; i++) {
                    String book = books[i];
                    output += (i + 1) + ". " + book + "\n";
                }
                output += "\n";
                outputDevice.output(output);
            }
        }
    }

    public static void main(String[] args) {
        new Main(new OutputDevice(), new InputDevice()).run();
    }
}
