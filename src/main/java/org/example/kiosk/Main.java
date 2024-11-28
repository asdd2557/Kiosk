package org.example.kiosk;

import org.example.kiosk.contoller.Menu;
import org.example.kiosk.resource.MenuItem;

public class Main {
    public static void main(String[] args) {
        // 각각의 카테고리를 나타내는 메뉴 객체 생성
        Menu bugger = new Menu();   // Burgers 카테고리
        Menu drink = new Menu();    // Drinks 카테고리
        Menu desserts = new Menu(); // Desserts 카테고리

        // Burgers 카테고리에 메뉴 아이템 추가
        bugger.getMenuItemsList().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        bugger.getMenuItemsList().add(new MenuItem("SmokeShack", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        bugger.getMenuItemsList().add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        bugger.getMenuItemsList().add(new MenuItem("Hamburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // Drinks 카테고리에 메뉴 아이템 추가
        drink.getMenuItemsList().add(new MenuItem("b", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        drink.getMenuItemsList().add(new MenuItem("bb", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        drink.getMenuItemsList().add(new MenuItem("bbb", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        drink.getMenuItemsList().add(new MenuItem("bbbb", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // Desserts 카테고리에 메뉴 아이템 추가
        desserts.getMenuItemsList().add(new MenuItem("d", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        desserts.getMenuItemsList().add(new MenuItem("dd", 8.9, "베이커, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        desserts.getMenuItemsList().add(new MenuItem("ddd", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        desserts.getMenuItemsList().add(new MenuItem("dddd", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // 키오스크 객체 생성
        Kiosk kiosk = new Kiosk();

        // 키오스크에 각각의 카테고리 메뉴를 추가
        kiosk.addMenu(bugger);   // Burgers 추가
        kiosk.addMenu(drink);    // Drinks 추가
        kiosk.addMenu(desserts); // Desserts 추가

        // 키오스크 실행 시작
        kiosk.start();
    }
}
