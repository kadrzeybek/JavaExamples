import java.util.Scanner;

public class week_6_1 {

	public static void main(String[] args) {
		
		//1.
		
		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("Enter a Number:");
		a= input.nextInt();
		
		switch(a%2) {
			case 0:
				System.out.print(a+" is a EVEN !!");
				break;
				
			case 1:
				System.out.print(a+" is a ODD !!");
				break;
		}
	}

}
