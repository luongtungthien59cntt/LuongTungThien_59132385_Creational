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
public class ShapeFactory {
    
    public Shape createShape(ShapeType type){
        switch (type) {
            case RECTANGLE:
                return Rectangle.getInstance();
            case TRIANGLE:
                return Triangle.getInstance();
            case CIRCLE:
                return Circle.getInstance();
            default:
                return null;    
        }
    }
    
}
