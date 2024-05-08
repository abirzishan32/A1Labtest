package com.example.a2007026;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
    @Test
    public void testArea1() {
        Circle circle = new Circle("Circle", 5.0);
        double area = Math.PI * 5 * 5;
        assertEquals("The area of the circle is correct", area, circle.area(), 0.001);
    }

    @Test
    public void testArea2() {
        Circle circle = new Circle("Circle", 10.0);
        double area = Math.PI * 10 * 10;
        assertEquals("The area of the circle is correct", area, circle.area(), 0.001);
    }

    @Test
    public void testPerimeter1() {
        Circle circle = new Circle("Circle", 5.0);
        double peri = 2 * Math.PI * 5.0;
        assertEquals("The perimeter of the circle is correct", peri, circle.perimeter(), 0.001);
    }


    @Test
    public void testPerimeter2() {
        Circle circle = new Circle("Circle", 10.0);
        double peri = 2 * Math.PI * 10.0;
        assertEquals("The perimeter of the circle is correct", peri, circle.perimeter(), 0.001);
    }

}
