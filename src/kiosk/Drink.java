package kiosk;

public class Drink extends MenuItem {
    public Drink(String name, int price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Drink";
    }
}