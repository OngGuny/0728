// 'or'를 어떻게 표현할 것인가. 
public class Practice0728No3 {
public static void main(String[] args) {
	int rd = (int)(Math.random()*10+1);
		
	switch (rd) {
	case 1: System.out.println("Bananas");
	break;

	case 2:System.out.println("Oranges");
	break;
	
	default: System.out.println("Nuts"); // 중간에 디폴트가 있어도 되나 break 필수 구지 마지막에 올 필요는 없긴하다. 

	break; 
	
	case 3:System.out.println("Peach");
	
	
	case 4:System.out.println("Apples");
	
	
	case 5:System.out.println("Plums");
	break;
	
	case 6:System.out.println("Pineapples");
	break;
	
	case 7:System.out.println("No message - ignore this case");
	break;
	

	}// 숫자 하나씩 안써도되고 스위치 밖에다 써주면 된다. 
	System.out.println("random number = "+rd);
}
}
