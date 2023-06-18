
public class week_3_9 {

	public static void main(String[] args) {
		
		//Display the multiplication table until 10 (as 10 x 10 table)
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("%d*%d=%d\t",i,j,(i*j));
			}
			System.out.println();
		}
	}

}
