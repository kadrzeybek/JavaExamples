
public class week_6_5 {

	public static void main(String[] args) {
		
		//5.
		
		String date="12.05.98";
		int month =Integer.parseInt(date.substring(3,5));
		int year = Integer.parseInt(date.substring(6,8));
		 if (year>60) {
			 year+=1900;
		 }else
			 year+=2000;
		 
		 switch(month) {
		 case 1:System.out.printf("%s January %d",date.substring(0,2),year);break;
		 case 2:System.out.printf("%s February %d",date.substring(0,2),year);break;
		 case 3:System.out.printf("%s March %d",date.substring(0,2),year);break;
		 case 4:System.out.printf("%s April %d",date.substring(0,2),year);break;
		 case 5:System.out.printf("%s May %d",date.substring(0,2),year);break;
		 case 6:System.out.printf("%s Jane %d",date.substring(0,2),year);break;
		 case 7:System.out.printf("%s July %d",date.substring(0,2),year);break;
		 case 8:System.out.printf("%s August %d",date.substring(0,2),year);break;
		 case 9:System.out.printf("%s September %d",date.substring(0,2),year);break;
		 case 10:System.out.printf("%s October %d",date.substring(0,2),year);break;
		 case 11:System.out.printf("%s November %d",date.substring(0,2),year);break;
		 case 12:System.out.printf("%s December %d",date.substring(0,2),year);
		 }
	}

}