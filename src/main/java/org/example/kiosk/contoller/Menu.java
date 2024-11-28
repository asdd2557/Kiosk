package org.example.kiosk.contoller;

import org.example.kiosk.resource.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class Menu {
   private List<MenuItem> menuItems_List = new ArrayList<>();

    public void showMenu(){
        int count = 0;
        for(MenuItem menuItem:menuItems_List){
            count++;
            System.out.println(count+". "+ menuItem.getName()+"   | W "+menuItem.getPrice()+" | "+menuItem.getExplanation());
        }
        System.out.println("0. 뒤로가기");
    }
    public List<MenuItem> getMenuItems_List() {
        return menuItems_List;
    }

}
