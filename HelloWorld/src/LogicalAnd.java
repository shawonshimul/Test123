import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter any leter ; ");
		ch=input.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("small letter");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("Capital letter");
		}
		
		else {
			System.out.println("You have to enter a letter ");
		}
		
		
}}
