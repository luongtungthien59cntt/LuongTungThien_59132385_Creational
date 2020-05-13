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
public class Bt3 {
    public static void main(String[] args) {
        
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape(ShapeType.RECTANGLE);
        Shape triangle = factory.createShape(ShapeType.TRIANGLE);
        Shape circle = factory.createShape(ShapeType.CIRCLE);
        
        System.out.println(rectangle.draw());
        System.out.println(triangle.draw());
        System.out.println(circle.draw());
    } 
}
