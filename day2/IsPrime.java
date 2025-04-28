package week1.day2;

public class IsPrime {
    public static void main(String[] args) {
        int number = 13; // Declaring the number
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i * i <= number; i++) { // Check up to square root of the number
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        // Display result in console
        System.out.println(number + " is prime? " + isPrime);
    }
}
