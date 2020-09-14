/* Name: John Lopez.
 * Date: 9/14/2020.
 */
package exercise19_9;

import java.util.ArrayList;

public class Exercise19_9 {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E currentMin;
        int currentMinIndex;

            for (int i = 0; i < list.size() - 1; i++) {
                currentMin = list.get(i);
                currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
	}
    }
}