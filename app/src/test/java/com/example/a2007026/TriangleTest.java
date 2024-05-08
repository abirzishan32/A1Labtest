package com.example.a2007026;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void testArea1() {
        Triangle triangle = new Triangle("Triangle", 5.0, 5.0, 5.0);
        double s = (5.0 + 5.0 + 5.0) / 2;
        double area = Math.sqrt(s * (s - 5.0) * (s - 5.0) * (s - 5.0));
        assertEquals("The area of the triangle is correct", area, triangle.area(), 0.001);
    }

    @Test
    public void testArea2() {
        Triangle triangle = new Triangle("Triangle", 10.0, 10.0, 10.0);
        double s = (10.0 + 10.0 + 10.0) / 2;
        double area = Math.sqrt(s * (s - 10.0) * (s - 10.0) * (s - 10.0));
        assertEquals("The area of the circle is correct", area, triangle.area(), 0.001);
    }

    @Test
    public void testPerimeter1() {
        Triangle triangle = new Triangle("Triangle", 5.0, 5.0, 5.0);
        double peri = 5.0 + 5.0 + 5.0;
        assertEquals("The perimeter of the circle is correct", peri, triangle.perimeter(), 0.001);
    }


}
