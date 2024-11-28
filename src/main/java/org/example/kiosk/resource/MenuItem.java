package org.example.kiosk.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {
    private String name; //이름
    private double price; //가격
    private String explanation; //설명
    public MenuItem(String name, double price, String explanation){
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
}
