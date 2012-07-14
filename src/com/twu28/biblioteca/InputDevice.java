package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDevice {
    private final BufferedReader reader;

    public InputDevice() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int read() {
        return Integer.parseInt(readInput());
    }

    public String readInput() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
