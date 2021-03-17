package thread.basic;
class A extends Thread{
	@Override
	public void run() {//
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
		System.out.println("[[[ A스레드 run ]]]");
	}
}/////////////// end of A ////////////////	

//class B extends Thread{
class B implements Runnable{
	@Override
	public void run() {//
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
		System.out.println("[[[ B스레드 run ]]]");
	}///////////////end of run
}/////////////// end of B ////////////////	
class ThreadEx13 {

	static long startTime = 0;
	/*
	29[main thread시작]-30[2:스레드로딩-ready-go->32[대기중]]-31-32[A run call] - 33[B run call]
	4-5-6(----------|||||||---------|||||||||||-----------------------------------------------------)
	14-15-16(|||||||||||||||||||------|||||||||||||||||||||||||||||||||||||||||||||||||||||||)
	42*/
	public static void main(String args[]) {
		A th1 = new A();
		B th = new B();
		Thread th2 = new Thread(th);
		th1.start();
		th2.start();
		//시간을 계산함.
		startTime = System.currentTimeMillis();
		/*  */
		try {
			th1.join();	// th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.print("소요시간:" + (System.currentTimeMillis() - ThreadEx13.startTime));
	} // main

}
