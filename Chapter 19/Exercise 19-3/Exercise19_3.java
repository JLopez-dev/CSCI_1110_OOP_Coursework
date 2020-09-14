/* Name: John Lopez.
 * Date: 9/10/2020.
 */
package exercise19_3;

import java.util.ArrayList;

public class Exercise19_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("Arraylist without duplicates:" + newList);
        System.out.println("Arraylist with duplicates: " + list);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
  
        for (Integer element : list) { 
            if (!newList.contains(element)) { 
                newList.add(element); 
            } 
        } 
        return newList; 
    }
}