
public class week_7_2 {

	public static void main(String[] args) {
		//Code the program that displays the negative integers of an array, and then positive integers
		int array1[]= {1,-3,4,5-6,-2,8};
		for(int i=0; i<array1.length;i++) {
			if(array1[i]<0)
				System.out.print(array1[i]+"  ");
		}
		for(int i=0; i<array1.length;i++) {
			if(array1[i]>0)
				System.out.print(array1[i]+"  ");
		}
	}

}
