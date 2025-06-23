package kiosk;

import java.util.*;

public class KioskApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<MenuItem> menu = Arrays.asList(
                new Burger("치즈버거", 5000),
                new Burger("불고기버거", 5500),
                new Drink("콜라", 1500),
                new Drink("사이다", 1500)
        );

        Cart cart = new Cart();
        boolean running = true;

        while (running) {
            System.out.println("\n★ 햄버거 키오스크 메뉴 ★");
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.get(i);
                System.out.printf("%d. [%s] %s - %d원\n", i + 1,
                        item.getCategory(),
                        item.getName(),
                        item.getPrice());
            }
            System.out.println("9. 장바구니 확인");
            System.out.println("0. 결제 후 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= menu.size()) {
                MenuItem selected = menu.get(choice - 1);
                System.out.print("수량 입력: ");
                int qty = sc.nextInt();
                cart.addItem(selected, qty);
                System.out.println("추가 완료!");
            } else if (choice == 9) {
                cart.showCart();
            } else if (choice == 0) {
                cart.showCart();
                System.out.println("결제를 진행합니다...");
                int total = cart.checkout();
                System.out.printf("결제 완료! 총 %d원 지불되었습니다. 감사합니다.\n", total);
                running = false;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        sc.close();
    }
}