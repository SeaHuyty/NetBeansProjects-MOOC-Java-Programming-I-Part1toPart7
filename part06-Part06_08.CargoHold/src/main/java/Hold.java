/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold (int weight) {
        this.maxWeight = weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Suitcase suitcase: this.suitcases) {
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }
    
    @Override
    public String toString() {
        return (this.suitcases.size() + " suitcases (" + totalWeight() + " kg)");
    }
}
