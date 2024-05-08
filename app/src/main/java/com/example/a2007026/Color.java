package com.example.a2007026;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public String showColor() {
        System.out.println("The color is: " + name);
        return name;
    }
}

class Red extends Color {
    public Red() {
        super("Red");
    }

    @Override
    public String showColor() {
        super.showColor();
        return "The color is: " + name;
    }
}

class Blue extends Color {
    public Blue() {
        super("Blue");
    }
    @Override
    public String showColor() {
        super.showColor();
        return "The color is: " + name;
    }
}

class Green extends Color {
    public Green() {
        super("Green");
    }
    @Override
    public String showColor() {
        super.showColor();
        return "The color is: " + name;
    }
}
