package week1.day2;

public class Fibonacci {
	
	    public static void main(String[] args) {
	        // Set range based on user input
	        int range = 8; // You specified 8 as the input

	        int first = 0, second = 1;

	        System.out.println("Fibonacci Series up to " + range + " terms:");

	        for (int i = 0; i < range; i++) {
	            System.out.print(first + " "); // Print current Fibonacci number
	            
	            // Calculate next Fibonacci number
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	}

