
public class UnaryDemo {

	public static void main(String[] args) {


		int x = 10;
		int y;
		
		y=x;
		System.out.println("y = "+y);
		
		/*y=x++;//post increment
		System.out.println("y 2nd = "+y);
		
		y=x++;
		System.out.println("y 3rd = "+y);
		
		y=x++;
		System.out.println("y 4th = "+y);
		*/
		
		y=--x;
		System.out.println("y 1st minus = "+y);
		
		y=x--;
		System.out.println("y next minus = "+y);
		
		y=x--;
		System.out.println("y 2nd next minus = "+y);
		

	}

}
