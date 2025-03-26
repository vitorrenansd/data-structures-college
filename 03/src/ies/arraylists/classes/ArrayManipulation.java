package ies.arraylists.classes;

import java.util.ArrayList;

public class ArrayManipulation extends ArrayList<String> {

    // Adicionar elemento
    public void addNewElement(ArrayList<String> obj, String element) {
        try {
            obj.add(element);
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    //add()

    // Remover elemento
    //remove(index)

    // Exibir a lista
    public void printList() {
        System.out.println();
    }

    // Tamanho da lista
    public int lengthList() {
        int length = 5;
        return length;
    }

    // Acessar um elemento


}