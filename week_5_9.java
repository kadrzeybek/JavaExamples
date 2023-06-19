import java.util.Scanner;

public class week_5_9 {

	public static void main(String[] args) {
		// 7.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of year:");
		int year=input.nextInt();
		
		if(year%4==0) {
			System.out.print("February is 29 days in "+ year);
		}else
			System.out.print("February is not 29 days in "+ year);
	}

}
