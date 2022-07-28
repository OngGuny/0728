import java.util.*;

public class Pratice0728No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		System.out.print("연도를 입력하세요. : ");
		int yr = sc.nextInt();

		System.out.print("월을 입력하세요. : ");
		int mo = sc.nextInt();
		
		boolean flag = gc.isLeapYear(yr);
		if (mo == 2) { // 2월이라면
			if (yr==flag) {
				System.out.println("마지막 날은 29일 입니다.");
			} else {
				System.out.println("마지막 날은 28일 입니다.");
			}
		} else if (mo != 2) {// 2월이 아니라면
			if (mo == 1 || mo == 5 || mo == 3 || mo == 10 || mo == 8 || mo == 7 || mo == 12) {
				System.out.println("마지막 날은 31일 입니다.");
			} else {
				System.out.println("마지막 날은 30일 입니다. ");
			}
		}
	}

}
