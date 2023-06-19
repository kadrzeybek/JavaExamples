import java.util.Scanner;

public class week_5_3 {

	public static void main(String[] args) {
		
		//1.
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a number:");
		int a = input.nextInt();
		
		if(a%2==0) {
			System.out.print(a+" is EVEN");

		}else
			System.out.print(a+" is ODD");

		
	}

}
