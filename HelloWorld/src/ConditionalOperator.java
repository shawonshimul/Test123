import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int digit1, digit2, large;
		
		System.out.println("Enter First Digit : ");
		digit1=input.nextInt();
		
		System.out.println("Enter Second Digit : ");
		digit2=input.nextInt();
		
		large = (digit1>digit2) ? digit1:digit2;
		System.out.println("Large number = "+large);
		
		

	}}