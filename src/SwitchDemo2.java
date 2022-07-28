import java.util.Scanner;
public class SwitchDemo2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("당신은 어느 계절을 좋아하시나요?(Spring / Summer / Fall / Winter)");
	String season = sc.nextLine();

	String flowers = (season.equals("Spring"))?"진달래, 개나리":
							(season.equals("Summer"))?"장미, 아카시아":
								(season.equals("Fall"))?"코스모스,백함'":
								(season.equals("Winter"))?"동백, 매화": ("그딴 계절은 없습니다.");

								
	
	
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
	// if는 이미 처리한 값이라도 끝날때 까지 계속 비교. 
	;//which는 if의  단점을 2개보완 
	switch(season) {
	case "Spring": System.out.println("진달래, 개나리"); break;
	
	case "Summer":	System.out.println("장미, 아카시아"); break;
	
	case "Fall": System.out.println("코스모스, 백합");
	break;
	
	case "Winter": System.out.println("동백, 미화");
	break;
	default : System.out.println("그딴 계절은 없습니다.");
	
	}
	
	
	
	
}
}