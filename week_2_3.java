import java.util.Scanner;

public class week_2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, subs;
		System.out.print("Enter first number:");
		a = input.nextDouble(); 
		System.out.print("Enter Second number:");
		b = input.nextDouble();
		
		subs = a - b;
		//a
		System.out.printf("%020f\n",subs);
		//b
		System.out.printf("%,20f\n",subs);
		//c
		System.out.printf("%,20f\n",subs);
		//d
		System.out.printf("%-+20f\n",subs);
		//e
		System.out.printf("%20.3f\n",subs);
		//f
		System.out.printf("%-20.3f\n",subs);
		//g
		System.out.printf("%+20.2f\n",subs);
		//h
		System.out.printf("%,-25f\n",subs);
		//i
		System.out.printf("%,25f\n",subs);
		//j
		System.out.printf("%,.4f\n",subs);
		//k
		System.out.printf("-%,.2f\n",subs);
		//l
		System.out.printf("-%.2f\n",subs);



		
	}

}
