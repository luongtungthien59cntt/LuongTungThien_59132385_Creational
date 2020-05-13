/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt3;

/**
 *
 * @author dell
 */
public class Rectangle extends Shape {
    
    public static Rectangle instance = null;
    
    public static Rectangle getInstance() {
        if(instance == null) instance = new Rectangle("","","");
        return instance;
    }

    private Rectangle(String brush, String paper, String frane) {
        super(brush, paper, frane);
    }

    @Override
    public String draw() {
        return "Draw Rectangle";
    } 
}
