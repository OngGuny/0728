
public class SwichDemo {
public static void main(String[] args) {
	int su = 234;
	
	System.out.println((su%2==0)?"짝수":"홀수");
	
	if(su%2==0) {
		System.out.println("짝");
	}else {
		System.out.println("홀");
	}
// 스위치 쓰려면 처음 들어가는 변수에 정수 값을 가져와야함 
	switch (su % 2) {
	case 1:
		System.out.println("홀수");
		//break;
		
	case 0:
		System.out.println("짝수");
		
		//break;
default :
	System.out.println("홀수");
	}

}
}
