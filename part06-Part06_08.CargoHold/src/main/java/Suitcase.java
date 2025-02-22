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

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int weight;
    
    public Suitcase(int maxWeight) {
        this.weight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= weight) {
            items.add(item);
        }
    }
    
    public void printItems () {
        for (Item item: this.items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Item item: this.items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }
        Item heaviestWeight = this.items.get(0);
        for (Item item: this.items) {
            if (item.getWeight() > heaviestWeight.getWeight()) {
                heaviestWeight = item;
            }
        }
        return heaviestWeight;
    }
    
    @Override
    public String toString() {
        if (this.items.size() == 1) { 
            return (this.items.size() + " item (" + totalWeight() + " kg)");
        } else if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        return (this.items.size() + " items (" + totalWeight() + " kg)");
    }
}
