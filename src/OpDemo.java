import java.util.Scanner;
import java.util.GregorianCalendar;
public class OpDemo {
	public static void main(String[] args) {
//		// '나머지'연산자 이것도 정수만 취급한다.
//		System.out.println("정수 나누기 5/2 = " + 5 / 2);
//		System.out.println("나머지 5/2 = " + 5 % 2);
//		// 이동 연산자
		// '<<' 비트단위로 이동
		// 4<<[2] => 0b|0000|0100 << 0b|0001|0000
		// 4 * (2)^[2] (2)진수 << 왼쪽으로. >> 오른쪽으로
		// 왼쪽 '곱하기'. 오른쪽 '나누기' 하려고 .
		// 여기서 문제는 오른쪽가는거. '사인 비트' 가있기때문에 .
		// 그래서 >>> 를 만든것.

//		//Shift operator
//		System.out.println(32767<<5); // 32767*2^5 
//		System.out.println(-32767>>5);  //2개짜리는 사인비트가 이동하면서 사인비트를 남김 
//		System.out.println(-32767>>>5); // 사인 비트가 이동하면서 빈자리에 무조건 0을 채우기 때문에 양수가 됨   
//		
//		int a =5;
//		int b =10;
//		int x =15;
//		if (a>x | ++b<x) {
//			System.out.println("참");
//		}else {
//				System.out.println("거짓");
//			}
//		System.out.println("b="+b);		
		// if의 오른쪽 가정을 할까 말까 하는걸 정하는게 &&와 &다.
		// 하나&는 왼쪽이 틀리면 오른쪽은 안함
		// &&는 왼쪽이 틀려도 오른쪽을 함.

		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 한개를 입력하세요.");
//		int su = sc.nextInt();
//		if(su%2==0) System.out.println("짝수이군요.");
//		else System.out.println("홀수이군요.");
//		
		// 이걸 삼항연산자로 압축
		// System.out.println((su %2==0)?"짝수이군요.":"홀수이군요.");

//		System.out.print("연도를 입력하세요 : ");
//	int ny = sc.nextInt();
//		System.out.println((ny % 400 == 0 || ny % 4 == 0 && ny % 100 != 0) ? "윤년이네요." : "평년이네요.");
////
//		System.out.print("연도 입력 : ");
//		int yr = sc.nextInt();
//		if ((yr % 400 == 0 || yr % 4 == 0 && yr % 100 != 0)) {
//			System.out.println("입력하신 " + yr + "는 윤년입니다.");
//		} else {
//			System.out.println("입력하신 " + yr + "는 평년입니다.");
		
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(yr);
// 		System.out.println("당신이 입력하신 "+yr+"년도는 "+((flag)?"윤년입니다.":"평년입니다.") );

		
		//int age = 26;
		//age++; //age=age+1
		//age = age +5; // 이건 어떻게? 
		//age +=5; //진짜 0.01초 이정도 차이밖에 안나지만 이게 몇만줄 쌓이면 크다. 

	//	int a=5 , b=10, x=15; 
		// , 는 나열 연산자 
		
		double year=(true)?2022:(3.14); //조건이 참이면 2022, 거짓일때 3.14 
		// 참 값을 받고싶다 하더라도 컴파일러는 참값, 거짓값을 먼저 형비교해서 double이있으면 둘다 double로 형변환한다. 
		
	
	
	}
}

// 오라클이 만들어놨다 사실. is = 입니까?  의 의미 
// public boolean isLeapYear(int year) api 에서 찾아보면 이렇다. 
// static 이 아니다. 주소 써야하는변수  주소는 어디니 
// 유틸. 그레고리안 캘린더 .


