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
public abstract class Shape {
    
    private String brush;
    private String paper;
    private String frane;
    
    public Shape(String brush, String paper, String frane){
        this.brush = brush;
        this.paper = paper;
        this.frane = frane;
    }
    
    public abstract String draw();
}
