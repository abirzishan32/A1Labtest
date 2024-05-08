package com.example.a2007026;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlueColorTest {
    @Test
    public void ShowName() {
        Blue blue = new Blue();
        assertEquals("The color is Blue", "Blue", blue.name);
    }

    @Test
    public void ShowColor() {
        Blue blue = new Blue();
        assertEquals("The color is Blue", "The color is: Blue", blue.showColor());
    }

}
