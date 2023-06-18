import java.util.Scanner;

public class week_3_6 {

	public static void main(String[] args) {
		
		//The user will enter two numbers from keyboard
		//Display even numbers between these two numbers.
		
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter first number:");
		a = input.nextInt();
		
		System.out.print("Enter last number:");
		b = input.nextInt();
		
		for(int i=a+(a%2) ;i<=b;i+=2) {
			System.out.println(i);
		}

	}

}
