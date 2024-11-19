package ThreadEx5;

import java.awt.Toolkit;

//단일 스레드 : 메인 스레드만 존재
public class BeepThreadMain {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		
		// thread 실행
		 thread.start();
		 
		//땡 다섯번 출력
		for(int i =0; i<5; i++) {
			System.out.print("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

}
