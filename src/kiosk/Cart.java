package kiosk;

import java.util.*;

public class Cart {
    private final List<OrderItem> items = new ArrayList<>();

    public void addItem(MenuItem item, int quantity) {
        items.add(new OrderItem(item, quantity));
    }

    public void showCart() {
        System.out.println("\n🛒 현재 장바구니:");
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            OrderItem order = items.get(i);
            System.out.printf("%d. [%s] %s x%d - %d원\n", i + 1,
                    order.getItem().getCategory(),
                    order.getItem().getName(),
                    order.getQuantity(),
                    order.getTotalPrice());
            total += order.getTotalPrice();
        }
        System.out.printf("총합: %d원\n", total);
    }

    public int checkout() {
        int total = 0;
        for (OrderItem order : items) {
            total += order.getTotalPrice();
        }
        items.clear();
        return total;
    }
}