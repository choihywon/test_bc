package ThreadEx5;
import java.awt.Toolkit; 
/*
 * Thread 하위 클래스로부터 생성
 * Thread 클래서 상속 받아  Thread  하위 클래스 만듦
 */
public class BeepThread extends Thread {
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}
}
