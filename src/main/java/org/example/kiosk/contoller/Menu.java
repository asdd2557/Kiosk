package org.example.kiosk.contoller;

import org.example.kiosk.resource.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 이 메뉴에 포함된 메뉴 아이템들을 저장하는 리스트
    private List<MenuItem> menuItemsList = new ArrayList<>();

    /**
     * 현재 메뉴에 포함된 모든 메뉴 아이템을 화면에 출력하는 메소드
     * - 각 메뉴 항목의 이름, 가격, 설명을 출력합니다.
     * - "뒤로가기" 옵션도 포함되어 있습니다.
     */
    public void showMenu() {
        int count = 0; // 메뉴 번호를 나타내는 변수

        // 메뉴 리스트에 있는 각 메뉴 아이템을 출력
        for (MenuItem menuItem : menuItemsList) {
            count++; // 메뉴 번호 증가
            System.out.println(count + ". " + menuItem.getName() + "   | W "
                    + menuItem.getPrice() + " | " + menuItem.getExplanation());
        }

        // 뒤로가기 옵션 출력
        System.out.println("0. 뒤로가기");
    }

    /**
     * 현재 메뉴에 포함된 메뉴 아이템 리스트를 반환하는 메소드
     * - 이 메소드는 외부에서 이 메뉴 객체의 아이템 리스트를 가져올 때 사용됩니다.
     */
    public List<MenuItem> getMenuItemsList() {
        return menuItemsList; // 메뉴 아이템 리스트 반환
    }
}
