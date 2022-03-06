package doodles_november;
import java.util.Scanner;

public class A_Program_That_Makes_U_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
	while (true) {
		System.out.print("Input first number: ");
		double a = scanner.nextInt();
		
		System.out.print("Input second number: ");
		double b = scanner.nextInt();
		
		System.out.println("Type 1 for addition\n"
				+ "Type 2 for subtraction\n"
				+ "Type 3 for multiplication\n"
				+ "Type 4 for division \n"
				+ "Type 5 to exit"
				+ "");
		
		int Userchoice = scanner.nextInt();
	
			if (Userchoice == 1) {
				addition(a,b);
			} else if (Userchoice == 2) {
				subtraction(a,b);
			} else if (Userchoice == 3) {
				multiplication(a,b);
			} else if (Userchoice == 4) {
				division(a,b);
			} else if (Userchoice==5){
				System.out.println("Goodbye.");
				break;
			}
			else {
				System.out.println("That is not in the choices, sir.");
			}
		}
	}
		
	
	public static void addition (double a, double b) {
		System.out.println(a + b);
	}
	
	public static void subtraction (double a, double b) {
		System.out.println(a - b);
	}
	
	public static void multiplication (double a, double b) {
		System.out.println(a * b);
	}
	
	public static void division (double a, double b) {
		System.out.println(a / b);
	}
	
}
