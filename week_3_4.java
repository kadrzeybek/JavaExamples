import java.util.Scanner;

public class week_3_4 {

	public static void main(String[] args) {
		
		//Display sum of n Natural Numbers.
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		int sum=0;
		
		for(int i=0; i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);

	}

}
