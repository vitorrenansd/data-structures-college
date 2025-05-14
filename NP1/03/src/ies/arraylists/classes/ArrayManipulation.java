package ies.arraylists.classes;

import java.util.ArrayList;

public class ArrayManipulation extends ArrayList<String> {

    // Returns the length of a arraylist
    public int getLength() {
        return this.size();
    }

    // Get a element by index
    public String getElement(int index) throws IndexOutOfBoundsException {
        return this.get(index);
    }

    // Add element to a arraylist
    public void addNewElement(String element) {
        this.add(element);
        System.out.println("Added successfully! Updated list: " + this.toString());
    }

    // Remove a element from this arraylist using index
    public void removeElement(int index) throws IndexOutOfBoundsException {
        this.remove(index);
        System.out.println("Removed successfully! Updated list: " + this.toString());
    }
}