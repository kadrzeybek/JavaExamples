
public class week_7_1 {

	public static void main(String[] args) {
		
		//code the program that creates and display the reverse of an array as another
		
		int [] array1= {1,2,3,4,5,6,7};
		int reverse_array[]= new int [7];
		for(int i=0;i<array1.length;i++) {
			reverse_array[i]=array1[6-i];
		}
		for(int i=0;i<7;i++)
			System.out.println(reverse_array[i]);
	}

}
