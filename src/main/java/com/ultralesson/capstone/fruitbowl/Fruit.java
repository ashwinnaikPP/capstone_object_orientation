package com.ultralesson.capstone.fruitbowl;

public class Fruit {
    private String name;
    private String color;
    private String type;
    private String size;


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
}
