
public class week_7_5 {

	public static void main(String[] args) {
		//Code the program that sums and displays the numbers of an array mutually starting from the beginning and the end.
		
		int array[]= {1,3,6,9,1,2,7,6};
		for(int i=0;i<array.length/2;i++) {
			System.out.println(array[i]+array[7-i]);
		}
	}

}
