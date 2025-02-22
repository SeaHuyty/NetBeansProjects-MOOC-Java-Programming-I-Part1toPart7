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

public class Room {
    private ArrayList<Person> person;
    
    public Room() {
        this.person = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.person.add(person);
    }
    
    public boolean isEmpty() {
        return (person.isEmpty() ? true : false);
    }
    
    public ArrayList<Person> getPersons() {
        return this.person;
    }
    
    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        Person shortestPerson = person.get(0);
        for (Person person: this.person) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        if (person.isEmpty()) {
            return null;
        }
        int index = 0;
        Person personToTake = shortest();
        for (Person person: this.person) {
            if (person.equals(shortest())) {
                personToTake = person;
                this.person.remove(index);
                break;
            }
            index++;
        }
        return personToTake;
    }
}
