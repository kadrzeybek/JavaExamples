
public class week_7_4 {

	public static void main(String[] args) {
		//Code the program that finds the highest number of digits of the elements of an array.
		long array[]= {115, -152842, 2843, -418415, 5188124, -48422226, 762525565, 9184841, 4751854, 35485};
		long digit=0,max_digit=0;
		for(int i=0;i<array.length;i++) {
			while(array[i]>0) {
				array[i]/=10;
				digit++;
			}
			if(digit>max_digit) {
				max_digit=digit;
			}
			digit=0;
		}
		System.out.print(max_digit);
			}
	
}
