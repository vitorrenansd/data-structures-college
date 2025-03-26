package ies.arraylists;

import ies.arraylists.classes.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<String>();
        ArrayManipulation am = new ArrayManipulation();
    
        // Tests
        am.addNewElement(myArr, "TUF");
        am.addNewElement(myArr, "Zotac");
        am.addNewElement(myArr, "Aorus");
        am.addNewElement(myArr, "ROG Strix");
        am.addNewElement(myArr, "Asus");
        am.addNewElement(myArr, "Gigabyte");

        am.removeElement(myArr, 2);

        System.out.println(am.getLength(myArr));
        System.out.println(am.getElement(myArr, 2));
    }
}