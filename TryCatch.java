package corejavapracticeproject;

public class TryCatch {

	public static void main(String[] args) {
	       int numerator = 10;
	        int denominator = 0;
	        int result;

	        try {
	            result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	            result = 0; // Assign a default value or take appropriate action
	        }

	        System.out.println("Program continues after the try-catch block.");

	}

}
