package com.example.a2007026;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
    @Test
    public void testArea1() {
        Square square = new Square("Square", 5.0);
        double area =  5 * 5;
        assertEquals("The area of the circle is correct", area, square.area(), 0.001);
    }

    @Test
    public void testArea2() {
        Square square = new Square("Square", 10.0);
        double area =  10 * 10;
        assertEquals("The area of the circle is correct", area, square.area(), 0.001);
    }

    @Test
    public void testPerimeter1() {
        Square square = new Square("Square", 5.0);
        double peri = 4 * 5.0;
        assertEquals("The perimeter of the circle is correct", peri, square.perimeter(), 0.001);
    }

    @Test
    public void testPerimeter2() {
        Square square = new Square("Square", 10.0);
        double peri = 4 * 10.0;
        assertEquals("The perimeter of the circle is correct", peri, square.perimeter(), 0.001);
    }

}
