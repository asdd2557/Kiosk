package org.example.kiosk;

import org.example.kiosk.contoller.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
   private List<Menu> menu_List = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println("[ Main Menu ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drink");
            System.out.println("3. Desserts");
            System.out.println("0. 종료     | 종료");
            switch (scanner.nextInt()) {
                case 1:
                    menu_List.get(0).showMenu();
                    inMenu(menu_List.get(0));
                    break;
                case 2:
                    menu_List.get(1).showMenu();
                    inMenu(menu_List.get(1));
                    break;
                case 3:
                    menu_List.get(2).showMenu();
                    inMenu(menu_List.get(2));
                    break;
                case 0:
                    return;
            }
        }
    }
    public void inMenu(Menu menu){
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(menu.getMenuItems_List().get(0).getName()+"을 주문하셨습니다.");
                System.out.println("");
                break;
            case 2:
                System.out.println(menu.getMenuItems_List().get(1).getName()+"을 주문하셨습니다.");
                System.out.println("");
                break;
            case 3:
                System.out.println(menu.getMenuItems_List().get(2).getName()+"을 주문하셨습니다.");
                System.out.println("");
                break;
            case 4:
                System.out.println(menu.getMenuItems_List().get(3).getName()+"을 주문하셨습니다.");
                System.out.println("");
                break;
            case 0:
                System.out.println("이전으로 돌어갑니다.");
                System.out.println("");
                return;
        }
    }
    public void addMenu(Menu menu){
        this.menu_List.add(menu);
    }
    public List<Menu> getMenu_List(){
        return this.menu_List;
    }
}
