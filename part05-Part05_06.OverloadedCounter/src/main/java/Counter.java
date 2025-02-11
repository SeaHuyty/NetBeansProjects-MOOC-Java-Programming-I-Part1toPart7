/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Counter {
    int startValue;
    
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public Counter() {
        this.startValue = 0;
    }
    
    public int value() {
        return this.startValue;
    }
    
    public void increase() {
        this.startValue += 1;
    }
    
    public void decrease() {
        this.startValue -= 1;
    }
    
}
