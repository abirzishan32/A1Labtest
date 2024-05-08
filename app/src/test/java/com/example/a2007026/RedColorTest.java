package com.example.a2007026;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RedColorTest {
    @Test
    public void ShowName() {
        Red red = new Red();
        assertEquals("The color is Red", "Red", red.name);
    }

    @Test
    public void ShowColor() {
        Red red = new Red();
        assertEquals("The color is Red", "The color is: Red", red.showColor());
    }
}
