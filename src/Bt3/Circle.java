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
public class Circle extends Shape {
    
    public static Circle instance = null;
    
    public static Circle getInstance() {
        if(instance == null) instance = new Circle("","","");
        return instance;
    }

    private Circle(String brush, String paper, String frane) {
        super(brush, paper, frane);
    }

    @Override
    public String draw() {
        return "Draw Cirele";
    } 
}