package week4.HomeAssign;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare two arrays
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};

        // Convert arrays to lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : array1) {
            list1.add(num);
        }
        for (int num : array2) {
            list2.add(num);
        }
        // Find intersection by checking common elements
        List<Integer> intersection = new ArrayList<>();
        for (int num : list1) {
            if (list2.contains(num)) {
                intersection.add(num);
            }
        }

        // Print intersection result
        System.out.println("Intersection of both arrays: " + intersection);
    }

	

}
