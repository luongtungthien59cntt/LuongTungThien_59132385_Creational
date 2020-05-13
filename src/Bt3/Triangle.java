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
public class Triangle extends Shape {
    
    public static Triangle instance = null;
    
    public static Triangle getInstance() {
        if(instance == null) instance = new Triangle("","","");
        return instance;
    }

    private Triangle(String brush, String paper, String frane) {
        super(brush, paper, frane);
    }

    @Override
    public String draw() {
        return "Draw Triangle";
    } 
}
