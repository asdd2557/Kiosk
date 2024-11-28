package org.example.kiosk;

import org.example.kiosk.contoller.Menu;
import org.example.kiosk.resource.MenuItem;

public class Main {
    public static void main(String[] args) {
        Menu bugger = new Menu();
        Menu drink = new Menu();
        Menu desserts = new Menu();
        bugger.getMenuItems_List().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        bugger.getMenuItems_List().add(new MenuItem("SmokeShack", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        bugger.getMenuItems_List().add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        bugger.getMenuItems_List().add(new MenuItem("Hamburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        drink.getMenuItems_List().add(new MenuItem("b", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        drink.getMenuItems_List().add(new MenuItem("bb", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        drink.getMenuItems_List().add(new MenuItem("bbb", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        drink.getMenuItems_List().add(new MenuItem("bbbb", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        desserts.getMenuItems_List().add(new MenuItem("d", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        desserts.getMenuItems_List().add(new MenuItem("dd", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        desserts.getMenuItems_List().add(new MenuItem("ddd", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        desserts.getMenuItems_List().add(new MenuItem("dddd", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(bugger);
        kiosk.addMenu(drink);
        kiosk.addMenu(desserts);
        kiosk.start();
    }
}
