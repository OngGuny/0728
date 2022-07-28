// 랜덤값 지정하는거 배움. 범위 등 api 베이스 랭 math random 
// 주사위를 맹글자 
public class RandomDemo {
public static void main(String[] args) {
	int rd=(int)(Math.random()*6+1);	// 기본 math.random은 0~1 사이 랜덤수를 나타냄 
	System.out.println(rd); //시차에 영향을 받아서 완전랜덤은아님. 
	
}
}
