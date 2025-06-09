package week4.HomeAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

     // Declare and convert array to List
        Integer[] numbers = {3, 2, 11, 4, 6, 7};
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        // Sort the list in ascending order
        Collections.sort(numberList);

        // Get the second last element using get() method
        int secondLargest = numberList.get(numberList.size() - 2);

        // Print the result
        System.out.println("Second largest number: " + secondLargest);


	}

}
