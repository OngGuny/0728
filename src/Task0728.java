
public class Task0728 {
public static void main(String[] args) {
	int c = 0;
	int d = 0;

	
	for(int a = 65; a<=90;a++) {
		c++;
		
		int g = (c%10);

		switch (g) {
		case 0: System.out.printf("%c",(a+3));
			
			break;

		default: System.out.printf("%c",(a+0));
			break;
		}
		
		
		System.out.print(a+"\t");
		
		if(c%5==0) {
			System.out.println();
		}
		}
		
		
		
		
		
		
//		if {
//			System.out.print(a);
//		}
	

}
}

