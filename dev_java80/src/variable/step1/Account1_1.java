package variable.step1;

public class Account1_1 {
	double kor 	= 0;//국어점수 담기
	double math = 0;//수학점수 담기
	double eng 	= 0;//영어점수 담기
	/*******************************************************************************************
	 * 총점을 구하는 메소드 입니다. 
	 * @param kor2 - 학생의 국어 점수
	 * @param math2 - 학생의 수학 점수
	 * @param eng2 - 학생의 영어 점수
	 * @return tot - 한 학생의 세 과목의 총점을 구하여 담는 변수
	 ******************************************************************************************/
	private double hap(double kor2, double math2, double eng2) {
		double tot = 0;
		tot = kor2 + math2 + eng2;
		System.out.println("tot ===> "+tot);
		return tot;
	}
	/*****************************************************************************************
	 * 평균을 구하는 메소드 구현
	 * @param tot - hap메소드를 호출 하여 tot를 받아온다.
	 * @return
	 ****************************************************************************************/
	private double avg(double tot) {
		//메소드에서 파라미터를 사용할 때 배달사고 이런것들을 주의하기
		System.out.println("파라미터로 넘어온 tot값 출력해 보기 ===> "+tot);
		//insert here
		double avg = 0.0;
		avg = tot/3;
		return 0;
	}
	//나는 메소드를 선언할 수 있다.
	//대입연산자 int i = 2;
	//메소드 안에 있는 ,는 열거형 연산자라고 한다.
	//. dot 연산자 - 주소번지.전역변수
	//점근제한자(access modifier) - static 수정자 - 리턴타입 - 메소드이름(파라미터1,파라미터2,...)
	public static void main(String[] args) {
		Account1_1 ac = new Account1_1();
		ac.kor = 70;
		ac.math = 80;
		ac.eng = 90;
		double tot = ac.hap(ac.kor,ac.math,ac.eng);
		double test_avg2 = ac.avg(tot, 3);//평균계산됨
	}
	/*********************************************************
	 * 값에 의한 호출이다.
	 * @param tot - 총합을 계산한 값
	 * @param subjectNumber - 과목수
	 * @return
	 */
	private double avg(double tot, int subjectNumber) {
		//0,0이 찍히면 배달사고가 일어났다. - 단위테스트 통해서 확인하고 진행하기
		System.out.println("tot==>"+tot+", subjectNumber==>"+subjectNumber);
		double imsi = tot/subjectNumber;
		return imsi;
	}


}


