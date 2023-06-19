import java.util.Scanner;

public class week_5_6 {

	public static void main(String[] args) {
		
		//4.
		Scanner input =new Scanner(System.in);
		int a ,b ,c,num= input.nextInt();
		
		a=num/100;
		b=(num/10)%10;
		c=num%10;
		if(a>=b && a>=c){
			System.out.print(a+"\t");
			if(b>=c) {
				System.out.print(b+"\t"+c);
			}else {
				System.out.print(c+"\t"+b);
			}
		}else if(b>=a && b>=c){
			System.out.print(b+"\t");
			if(a>=c) {
				System.out.print(a+"\t"+c);
			}else {
				System.out.print(c+"\t"+a);
			}
		}else{
			System.out.print(c+"\t");
			if(a>=b) {
				System.out.print(a+"\t"+b);
			}else {
				System.out.print(b+"\t"+a);
			}
		}
		

	}

}
