package exercise19_9;

import java.util.ArrayList;
        
public class TestExercise19_9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        Exercise19_9.<Integer>sort(list);
        
        System.out.print(list);
        
    }
}
