import java.util.Scanner;

public class week_2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, mult;
		int b;
		System.out.print("Enter Double number:");
		a = input.nextDouble(); 
		System.out.print("Enter Integer number:");
		b = input.nextInt();
		
		mult = a * (double)b;
		//a
		System.out.printf("%020.3f\n",mult);
		//b
		System.out.printf("%,20.2f\n",mult);
		//c
		System.out.printf("-%020f\n",mult);
		//d
		System.out.printf("%,-25.2f\n",mult);
		//e
		System.out.printf("%,025f\n",mult);
		//f
		System.out.printf("-%,f\n",mult);



		
	}

}