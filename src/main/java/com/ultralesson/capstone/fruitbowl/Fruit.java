package com.ultralesson.capstone.fruitbowl;

public class Fruit {
    private final String name;
    private final String color;
    private final String type;
    private final String size;


    public Fruit(String name, String color, String type, String size) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
