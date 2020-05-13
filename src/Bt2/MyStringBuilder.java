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
public class MyStringBuilder {
    
    private String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder addString(String s) {
        str = str + " " + s;
        return this;
    }

    public MyStringBuilder addFloat(float f) {
        str = str + " " + f;
        return this;
    }

    public MyStringBuilder addBool(boolean b) {
        str = str + " " + b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
    

