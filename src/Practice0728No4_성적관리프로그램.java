import java.util.Arrays;
public class Practice0728No4_성적관리프로그램 {
public static void main(String[] args) {
	Student neo = new Student();
	neo.sn = "2022001";
	neo.name = "Neo";
	neo.kor = 100;
	neo.mat = 78;
	neo.eng = 89;
	neo.total =(neo.kor + neo.eng + neo.mat); 
	neo.avg= (neo.total/3);
	int av = (int)(neo.avg);
	
	//3항연산자 , 스위치, 이프 써서 학점 나타내보자 
	//int 형변환 한자리수만 된다. ㅂㅈㄷㅂㅈㅇㅁㄴㅇㄻㄻㄿ
	switch (av/10) {
	case 1:  System.out.println("A");
	
	break;
	
	case 2: if(av>50) {System.out.println("B");
	}
	break;
	case 3:
	case 4:
	case 5:
		
		break;

	default: System.out.println("--");
		break;
	}
}
}
