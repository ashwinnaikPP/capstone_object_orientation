package fruitbowl;

public class SingleBowl {

    private String fruit;
    private String color;
    private String type;
    private String size;

    public SingleBowl(String fruit, String color, String type, String size) {
        this.fruit = fruit;
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getFruit() {
        return fruit;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SingleBowl{" +
                "fruit='" + fruit + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
