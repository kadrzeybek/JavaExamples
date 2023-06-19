import java.util.Scanner;

public class week_5_2 {

	public static void main(String[] args) {
		
		// Code the program that display the status of a number
		//<<positive>>, <<negative>>, or <<zero>>.
		Scanner input= new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number:");
		number = input.nextInt();
		if(number<0) {
			System.out.print(number+" is negative number");
		}else if(number==0) {
			System.out.print(number+" equals 0");
		}else {
			System.out.print(number+" is positive number");
		}
			
		
	}

}
