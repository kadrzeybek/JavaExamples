
public class week_7_3 {

	public static void main(String[] args) {
		//Code the program that finds and displays the maximum and minimum values of an array.
		int []array1= {24,6,1,8,34};
		int min=array1[0], max=array1[0];
		for(int i=0;i<array1.length;i++)
			if(max<array1[i])
				max=array1[i];
		
		for(int i=0;i<array1.length;i++)
			if(min>array1[i])
				min=array1[i];
		
		System.out.println("Max değer:"+max);
		System.out.print("Min değer:"+min);

	}

}
