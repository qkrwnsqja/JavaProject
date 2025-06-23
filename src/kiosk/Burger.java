package kiosk;

public class Burger extends MenuItem {
    public Burger(String name, int price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Burger";
    }
}