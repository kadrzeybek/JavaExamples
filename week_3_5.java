import java.util.Scanner;

public class week_3_5 {

	public static void main(String[] args) {
		//Display factorial value of n
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum=1;
		for(int i=1; i<=n;i++) {
			sum*=i;
		}
		System.out.print(n+" Factorial = "+ sum);
	}

}
