import java.util.Scanner;

public class week_3_11 {

	public static void main(String[] args) {
		
		//The user will enter two numbers to calculate the result of C(n/r)
		//Code the program calculate and display the result of C(n/r) by using for loop
		
		Scanner input = new Scanner(System.in);
		int a ,b, result1=1,result2=1;
		
		System.out.print("Enter n:");
		a = input.nextInt();
		
		System.out.print("Enter r:");
		b = input.nextInt();
		
		for(int i=a; i>a-b;i--) {
			
			result1*=i;
			
		}
		for(int i=b; i>0;i--) {
			
			result2*=i;
			
		}
		System.out.printf("C(%d,%d)=%d",a,b,(result1/result2));

	}

}
