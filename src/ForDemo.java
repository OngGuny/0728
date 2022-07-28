// for 는 범위의 시작, 끝, 증가값 필요  한번에 써준다. ;로 파트 구분 해준다. 
public class ForDemo {
	public static void main(String[] args) {
//	
//		for(int su = 1; su<=10;su++) { 
//	
//		System.out.print(su+"\t");
//		}
////	
//		for(int su = 10; su>0;su--) {
//			System.out.print(su+"\t");
//		for(int su = 1;su<=20; su++) { // 증감값 1밖에 안된다. 나머지는 if로 조건붙여서 출력 
//			if (su%3==0) {
//			System.out.print(su+"\t");
//		}
//		}
		//20부터 80까지 7의배수를 출력 + 한줄에 5개씩만 
		int c = 0;
		for(int su = 20;su<=180; su++) { 
			if (su%7==0) {
			System.out.print(su+"\t");
			c++;
			if(c%5==0)System.out.println();
			}
		}
//	
//		System.out.print("\n");
//		
//		for(int su = 56;su<=90; su++) { 
//			if (su%7==0) {
//				System.out.print(su+"\t");
//			}
//		}
//		
//		System.out.print("\n");
//		for(int su = 91;su<=125; su++) { 
//			if (su%7==0) {
//				System.out.print(su+"\t");
//			}
//		}
//		
//		System.out.print("\n");
//		for(int su = 126;su<=160; su++) { 
//			if (su%7==0) {
//				System.out.print(su+"\t");
//			}
//		}
//		
//		
//		System.out.print("\n");
//		for(int su = 161;su<=180; su++) { 
//			if (su%7==0) {
//				System.out.print(su+"\t");
//			}
//		}
//		
		
	}
	//  su 를 1로 초기화후 물어본다 .10보다 작은가? 참이면 +1해준다. 거짓이면 끝난다. 
	
	}
	
