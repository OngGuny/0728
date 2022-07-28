import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//	int point = 59; 
//	if (point>=60) {//참일경우
//		System.out.println("합격입니다. 축하합니다. ");
//	}else {//참이 아닐경우 
//		System.out.println("불합격입니다. ㅉ");
//	}
		Scanner sc = new Scanner(System.in);
		System.out.println("당신은 어느 계절을 좋아하시나요?(Spring / Summer / Fall / Winter)");
		String season = sc.nextLine();
		if (season.equals("Spring")) {
			System.out.println("진달래, 개나리");
		} else if (season.equals("Summer")) {
			System.out.println("장미, 아카시아");
		} else if (season.equals("Fall")) {
			System.out.println("코스모스, 백합");
		} else if (season.equals("Winter")){
			System.out.println("동백, 매화");
		}	else {
				System.out.println("그딴 계절은 없습니다.");
			}

		}
		// 스트링은 == 을 인식하지 못함. 값이아니라 스트링은 주소 이기 때문에.
		// 또 api가서 스트링에서 찾아준다. 스트링 비교

	}

