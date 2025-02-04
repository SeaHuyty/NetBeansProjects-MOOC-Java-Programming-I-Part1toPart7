/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Gauge {
    private int value;
    
    public Gauge () {
        value = 0;
    }
    
    public void increase() {
        if (value < 5) {
            value += 1;
        }
    }
    
    public void decrease() {
        if (value > 0) {
            value -= 1;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        return (value == 5) ? true : false;
    }
}
