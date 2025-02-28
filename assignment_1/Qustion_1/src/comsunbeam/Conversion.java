package comsunbeam;
/*import java.util.Scanner;

public class convertion {

	public static void main(String[] args) {
	//Input number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = sc.nextInt();
		System.out.println("given number : "+number);
		Binary Bieq = sc.toBinaryString(number);
		System.out.println("Binary equivalent = "+Bieq);
		
*/
		import java.util.Scanner;

		public class Conversion {
		    public static void main(String[] args) {
		        // Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user for input
		        System.out.print("Enter Number: ");
		        int number = scanner.nextInt();

		        // Display the number and its equivalents
		        System.out.println("Given Number: " + number);
		        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
		        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
		        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());

		        // Close the scanner
		        scanner.close();
		    }
		
	}



