package com.example.a2007026;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GreenColorTest {
    @Test
    public void ShowName() {
        Green green = new Green();
        assertEquals("The color is Green", "Green", green.name);
    }

    @Test
    public void ShowColor() {
        Green green = new Green();
        assertEquals("The color is Green", "The color is: Green", green.showColor());
    }
}
