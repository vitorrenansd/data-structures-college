package ies.arraylists.classes;

import java.util.ArrayList;

public class ArrayManipulation extends ArrayList<String> {

    // Returns the length of a arraylist
    public int getLength(ArrayList<String> obj) throws NullPointerException {
        return obj.size();
    }

    // Get a element by index
    public String getElement(ArrayList<String> obj, int index) throws NullPointerException {
        return obj.get(index);
    }

    // Add element to a arraylist
    public void addNewElement(ArrayList<String> obj, String element) {
        try {
            obj.add(element);
            System.out.println("Added successfully! Updated list: " + obj.toString());
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    // Remove a element from arraylist using index
    public void removeElement(ArrayList<String> obj, int index) {
        try {
            obj.remove(index);
            System.out.println("Removed successfully! Updated list: " + obj.toString());
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}