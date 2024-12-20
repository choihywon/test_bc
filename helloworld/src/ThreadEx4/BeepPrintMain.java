package ThreadEx4;

import java.awt.Toolkit;

//단일 스레드 : 메인 스레드만 존재
public class BeepPrintMain {

	public static void main(String[] args) {
		
		//작업 스레드 생성
		//익명 구현 객체 사용(BeepTask 사용 x)
		Thread thread = new Thread(() -> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				//비프음
				for(int i =0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// e.printStackTrace();
					}
				}
		});
		
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
