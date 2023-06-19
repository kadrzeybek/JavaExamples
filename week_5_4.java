import java.util.Scanner;

public class week_5_4 {

	public static void main(String[] args) {
		
		//2.
		Scanner input =new Scanner(System.in);
		int a ,b ,c,num= input.nextInt();
		
		a=num/100;
		b=(num/10)%10;
		c=num%10;
		
		if(a<b && b<c) {
			System.out.print("increasing");
		}else if(a>b && b>c) {
			System.out.print("Decreasing");
		}else {
			System.out.print("neither increasing nor decreasing");

		}
		
	}

}
