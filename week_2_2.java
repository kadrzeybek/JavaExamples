import java.util.Scanner;

public class week_2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, sum;
		System.out.print("Enter first number:");
		a = input.nextInt(); 
		System.out.print("Enter Second number:");
		b = input.nextInt();
		
		sum = a + b;
		System.out.printf("%012d\n",sum);
		System.out.printf("%,12d\n",sum);
		System.out.printf("%,12d\n",sum);
		System.out.printf("%-+12d\n",sum);
		System.out.printf("-%,d\n",sum);
		
	}

}
