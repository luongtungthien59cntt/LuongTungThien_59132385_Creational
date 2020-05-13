/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt2;

/**
 *
 * @author dell
 */
public class Bt2 {
    
    public static void main(String[] args) {
       
        String value = new MyStringBuilder("Lương")
                .addString("Tùng Thiện")
                .addFloat(59)
                .addBool(true)
                .toString();

        System.out.println(value);
    }
    
}
