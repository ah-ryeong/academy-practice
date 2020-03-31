package Animal;

//1. 변수 : public static final 생략
// 2. 함수 : public abstract 생략 
interface 부서 {
	int 총무과 = 10;
	int 생산팀 = 20;
	int 인사과 = 30;
	int 행정과 = 40;
}

public class InterFaceEx01 {

	public static void main(String[] args) {
		System.out.println(부서.총무과);
	}
}
