import java.util.Scanner;

public class week_5_1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number:");
		number = input.nextInt();
		if(number<50) {
			System.out.print(number+" is less than 50");
		}else if(number==50) {
			System.out.print(number+" equals 50");
		}else {
			System.out.print(number+" is greater than 50");
		}
			
		
	}

}
