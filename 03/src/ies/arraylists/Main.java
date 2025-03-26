package ies.arraylists;

import ies.arraylists.classes.*;

public class Main {
    public static void main(String[] args) {
        ArrayManipulation list = new ArrayManipulation();
    
        // Tests
        list.addNewElement("TUF");
        list.addNewElement("Zotac");
        list.addNewElement("Aorus");
        list.addNewElement("ROG Strix");
        list.addNewElement("Asus");
        list.addNewElement("Gigabyte");

        list.removeElement(2);

        System.out.println(list.getLength());
        
        System.out.println(list.getElement(3));
    }
}