package com.example.a2007026;

public class Square {
    private double side_length;

    public Square(String name, double side) {
        this.side_length = side_length;
    }

    public double area() {
        return side_length * side_length;
    }

    public double perimeter() {
        return 4 * side_length;
    }
}
