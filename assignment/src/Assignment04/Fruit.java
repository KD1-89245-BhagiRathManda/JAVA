package assignment04;

public abstract class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit() {
    }

    public Fruit(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }
    public abstract String taste();

    @Override
    public String toString() {
        return "Name : "+this.name+ ", Color : "+this.color+ ", Weight : "+this.weight+ ", isFresh : "+this.isFresh;
    }
}
