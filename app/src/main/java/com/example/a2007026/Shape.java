package com.example.a2007026;

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

}
