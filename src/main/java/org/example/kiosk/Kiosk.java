package org.example.kiosk;

import org.example.kiosk.contoller.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 키오스크에서 사용할 메뉴 리스트를 저장
    private List<Menu> menu_List = new ArrayList<>();
    Scanner scanner = new Scanner(System.in); // 사용자 입력 처리

    // 키오스크를 시작하는 메소드
    public void start() {
        while (true) { // 키오스크는 사용자가 종료를 선택할 때까지 반복
            System.out.println("[ Main Menu ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drink");
            System.out.println("3. Desserts");
            System.out.println("0. 종료     | 종료");

            // 사용자의 입력에 따라 동작을 분기
            switch (scanner.nextInt()) {
                case 1:
                    // Burgers 메뉴를 출력하고 해당 메뉴로 이동
                    menu_List.get(0).showMenu();
                    inMenu(menu_List.get(0));
                    break;
                case 2:
                    // Drink 메뉴를 출력하고 해당 메뉴로 이동
                    menu_List.get(1).showMenu();
                    inMenu(menu_List.get(1));
                    break;
                case 3:
                    // Desserts 메뉴를 출력하고 해당 메뉴로 이동
                    menu_List.get(2).showMenu();
                    inMenu(menu_List.get(2));
                    break;
                case 0:
                    // 0번 선택 시 프로그램 종료
                    return;
            }
        }
    }

    // 특정 메뉴 내에서 사용자의 선택을 처리하는 메소드
    public void inMenu(Menu menu) {
        // 사용자의 입력에 따라 동작을 분기
        switch (scanner.nextInt()) {
            case 1:
                // 첫 번째 메뉴 아이템을 주문
                System.out.println(menu.getMenuItems_List().get(0).getName() + "을 주문하셨습니다.");
                System.out.println("");
                break;
            case 2:
                // 두 번째 메뉴 아이템을 주문
                System.out.println(menu.getMenuItems_List().get(1).getName() + "을 주문하셨습니다.");
                System.out.println("");
                break;
            case 3:
                // 세 번째 메뉴 아이템을 주문
                System.out.println(menu.getMenuItems_List().get(2).getName() + "을 주문하셨습니다.");
                System.out.println("");
                break;
            case 4:
                // 네 번째 메뉴 아이템을 주문
                System.out.println(menu.getMenuItems_List().get(3).getName() + "을 주문하셨습니다.");
                System.out.println("");
                break;
            case 0:
                // 0번 선택 시 이전 메뉴로 돌아감
                System.out.println("이전으로 돌아갑니다.");
                System.out.println("");
                return;
        }
    }

    // 새로운 메뉴를 추가하는 메소드
    public void addMenu(Menu menu) {
        this.menu_List.add(menu); // 메뉴 리스트에 새로운 메뉴를 추가
    }

    // 현재 메뉴 리스트를 반환하는 메소드
    public List<Menu> getMenu_List() {
        return this.menu_List; // 저장된 메뉴 리스트 반환
    }
}
