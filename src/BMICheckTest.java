
// 체중과 신장을 입력받아 BMI 수치 측정 
//	고도비만 35이상
//경도(1단계) 25-29.9
// 과체중 23-24.9
//정상 18.5-22.9
// 저체중 18.5 미만 
import java.util.Scanner;

public class BMICheckTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client neo = new Client();

		System.out.print("Name : ");
		neo.name = sc.nextLine();

		System.out.print("Age : ");
		neo.age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Gender(남 : m , 여 : f) : ");
		String gen = sc.nextLine(); // "m" 을입력받고 'm'을 출력
		neo.gen = gen.charAt(0);

		System.out.print("Weight : ");
		neo.wi = sc.nextDouble();

		System.out.print("Height : ");
		neo.hi = sc.nextDouble();

		double bmi = neo.wi / ((neo.hi * .01) * (neo.hi * .01));
		neo.bmi = bmi;

		if (bmi >= 35)
			neo.result = "고도 비만";
		else if (bmi>=30&&bmi < 35)
			neo.result = "중도 비만(2단계 비만)";
		else if (bmi>=25&&bmi < 30)
			neo.result = "경도 비만(1단계 비만)";
		else if (bmi>=23&&bmi < 25)
			neo.result = "과체중";
		else if (bmi>=18.5&&bmi < 23)
			neo.result = "정상";
		else
			neo.result = "저체중";

		System.out.println("<<고객 검진 결과>>");
		System.out.println("이름 : "+neo.name);
		System.out.println("나이 : "+neo.age);
		System.out.println((neo.gen=='m')?"성별 : 남성":"성별 : 여성");
		System.out.println("신장 : "+neo.hi);
		System.out.println("체중 : "+neo.wi);
		System.out.println("BMI 지수 : "+neo.bmi);
		System.out.println("결과 : "+neo.result);
		System.out.println((neo.bmi>=30)?"도야지시네요;":"며르치시네요;");
	}
}
