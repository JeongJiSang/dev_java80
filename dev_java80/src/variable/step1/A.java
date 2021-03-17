package variable.step1;

public class A {
	//전역변수의 경우 초기화를 생략할 수 있다.
	public double kor 	= 0;//국어점수 담기
	double math = 0;//수학점수 담기
	double eng 	= 0;//영어점수 담기
	double kor1;//국어점수 담기
	double math1;//수학점수 담기
	double eng1;//영어점수 담기
	
	double kor2 	= 70;//국어점수 담기
	double math2 	= 80;//수학점수 담기
	double eng2 	= 90;//영어점수 담기
	void methodA() {
		/* 지역변수이다.
		double kor 	= 70;//국어점수 담기
		double math = 80;//수학점수 담기
		double eng 	= 90;//영어점수 담기	
		*/
		kor 	= 70;//국어점수 담기
		math    = 80;//수학점수 담기
		eng 	= 90;//영어점수 담기			
	}
}
