
public class week_3_8 {

	public static void main(String[] args) {
		
		//Display the first 50 number of fibonacci
		long a1=1, a2=1, a3;
		
		System.out.println("1.\t"+a2+"\n2.\t"+a2);
		
		for(int i=1;i<50;i++) {
			a3= a1+a2;
			System.out.println((i+1)+"\t"+a3);
			a1=a2;
			a2=a3;
		}
		
	}
	
}