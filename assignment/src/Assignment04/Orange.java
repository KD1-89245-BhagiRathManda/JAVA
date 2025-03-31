package assignment04;

public class Orange extends Fruit{
    public Orange() {
    }

    public Orange(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String taste() {
        return "sour";
    }
}
