import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter any letter : ");
		ch = input.next().charAt(0); 
		
		if(ch=='a') {
			System.out.println("vowel");
		}
		
		else if(ch=='e'){
			System.out.println("vowel");
		}
		
		else if(ch=='i'){
			System.out.println("vowel");
		}
		
		else if(ch=='o'){
			System.out.println("vowel");
		}
		
		else if(ch=='u'){
			System.out.println("vowel");
		}
		
		else {
			System.out.println("Consonent");
		}
	}

}
