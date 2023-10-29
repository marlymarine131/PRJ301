/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author oteee
 */
public class Counter implements Serializable{
    private int count;

    public Counter(int count) {
        this.count = count;
    }
    
    
    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return ++count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
