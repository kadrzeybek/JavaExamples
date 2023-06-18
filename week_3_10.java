import java.util.Scanner;

public class week_3_10 {

	public static void main(String[] args) {
		
		//The user will enter two numbers to calculate the result of P(n/r)
		//Code the program calculate and display the result of P(n/r) by using for loop
		
		Scanner input = new Scanner(System.in);
		int a ,b, result1=1,result2=1;
		
		System.out.print("Enter n:");
		a = input.nextInt();
		
		System.out.print("Enter r:");
		b = input.nextInt();
		
		for(int i=a; i>0;i--) {
			
			result1*=i;
			
		}
		for(int i=(a-b); i>0;i--) {
			
			result2*=i;
			
		}
		System.out.printf("P(%d,%d)=%d",a,b,(result1/result2));

	}

}
